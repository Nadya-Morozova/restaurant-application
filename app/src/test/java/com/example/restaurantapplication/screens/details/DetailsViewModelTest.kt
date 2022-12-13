package com.example.restaurantapplication.screens.details

import android.content.Context
import androidx.arch.core.executor.ArchTaskExecutor
import androidx.arch.core.executor.TaskExecutor
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.repository.ProductDbRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.mockito.Mockito
import org.mockito.kotlin.mock

@ExperimentalCoroutinesApi
class DetailsViewModelTest {

    private val productDbRepository = mock<ProductDbRepository>()

    @ExperimentalCoroutinesApi
    private val testDispatcher = TestCoroutineDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)

        ArchTaskExecutor.getInstance().setDelegate(object : TaskExecutor() {
            override fun executeOnDiskIO(runnable: Runnable) = runnable.run()

            override fun isMainThread(): Boolean = true

            override fun postToMainThread(runnable: Runnable) = runnable.run()
        })
    }

    @After
    fun after() {
        Mockito.reset(productDbRepository)

        Dispatchers.resetMain()
        testDispatcher.cleanupTestCoroutines()
        ArchTaskExecutor.getInstance().setDelegate(null)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun `should return not null item of food`() = runTest {
        Mockito.`when`(productDbRepository.getFoodById("1")).thenReturn(Food(1))
        val contextMock = mock<Context>()
        val viewModel = DetailsViewModel(productDbRepository, contextMock)
        viewModel.getFoodById("1")

        assertEquals(Food(1), viewModel.foodItem.value)
    }
}