package ir.mjkhaani.recipeapp.dependencyInjection

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ir.mjkhaani.recipeapp.persentation.ui.BaseApplication
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule{
    @Singleton
    @Provides
    fun privateApplication(@ApplicationContext app:Context): BaseApplication {
        return app as BaseApplication
    }

    @Singleton
    @Provides
    fun provideToken():String{
        return "Token 9c8b06d329136da358c2d00e76946b0111ce2c48";
    }
}