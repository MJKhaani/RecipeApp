package ir.mjkhaani.recipeapp.dependencyInjection

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ir.mjkhaani.recipeapp.persentation.ui.BaseApplication
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule{
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app:Context): BaseApplication {
        return app as BaseApplication
    }


}