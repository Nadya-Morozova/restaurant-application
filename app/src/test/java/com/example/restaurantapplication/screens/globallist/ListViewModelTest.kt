package com.example.restaurantapplication.screens.globallist

import androidx.arch.core.executor.ArchTaskExecutor
import androidx.arch.core.executor.TaskExecutor
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.repository.ProductDbRepository
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

@ExperimentalCoroutinesApi
class ListViewModelTest {

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
    fun `should load list of food`() = runTest {
        val expected = mutableListOf(
            Food(1), Food(2), Food(3)
        )
        Mockito.`when`(productDbRepository.getListOfPopular()).thenReturn(
            expected
        )

        val viewModel = ListViewModel(productDbRepository)
        viewModel.getListOfPopular()

        assertEquals(expected, viewModel.listOfFood.value)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun `is the method to get list of food called at least once`() = runTest {
        val viewModel = ListViewModel(productDbRepository)
        viewModel.getListOfPopular()

        verify(productDbRepository, times(1)).getListOfPopular()
    }

}