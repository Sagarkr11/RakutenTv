package jp.co.rakuten.tech.rakutentv.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import jp.co.rakuten.tech.rakutentv.model.category.Category
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import org.mockito.Mockito.`when`

@RunWith(JUnit4::class)
class CategoryDetailViewModelTest {

  lateinit var viewModel: CategoryDetailViewModel
  lateinit var result: LiveData<List<Category>>
  lateinit var context: Context

  @Before
  fun init() {
    MockitoAnnotations.initMocks(this)

    viewModel = mock(CategoryDetailViewModel::class.java)
    result = mock(LiveData::class.java) as LiveData<List<Category>>
    context = mock(Context::class.java)

  }

  @Test
  fun getCategoryDetailEquals() {
    //`when`(viewModel.getCategoryDetail(context)).thenReturn(result)
    Assert.assertEquals(viewModel.getCategoryDetail(context), result)
  }

  @Test
  fun getCategoryDetailNotEquals() {
    //`when`(viewModel.getCategoryDetail(context)).thenReturn(result)
    Assert.assertNotEquals(viewModel.getCategoryDetail(context), "")
  }
}