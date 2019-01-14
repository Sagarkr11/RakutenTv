package jp.co.rakuten.tech.rakutentv.repository

import android.content.Context
import androidx.lifecycle.LiveData
import jp.co.rakuten.tech.rakutentv.model.category.Category
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class CategoryDetailRepoTest {

  lateinit var categoryDetailRepo: CategoryDetailRepo
  lateinit var result: LiveData<List<Category>>
  lateinit var context: Context

  @Before
  fun init() {
    MockitoAnnotations.initMocks(this)

    categoryDetailRepo = mock<CategoryDetailRepo>(CategoryDetailRepo::class.java)
    result = mock<LiveData<*>>(LiveData::class.java) as LiveData<List<Category>>
    context = mock(Context::class.java)

  }

  @Test
  fun getCategoryDetailEquals() {
    /*`when`<LiveData<List<Category>>>(categoryDetailRepo.getCategoryDetail(context)).thenReturn(
      result
    )*/
    Assert.assertEquals(categoryDetailRepo.getCategoryDetail(context), result)
  }

  @Test
  fun getCategoryDetailNotEquals() {
    /*`when`<LiveData<List<Category>>>(categoryDetailRepo.getCategoryDetail(context)).thenReturn(
      result
    )*/
    Assert.assertNotEquals(categoryDetailRepo.getCategoryDetail(context), "")
  }

}