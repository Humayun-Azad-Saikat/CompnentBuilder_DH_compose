package com.example.componentbuilder_dh_compose

import com.example.componentbuilder_dh_compose.modules.AnalyticsModule
import dagger.Component
import javax.inject.Singleton

//this is parent component

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    //fun getAnalyticsService():AnalyticsService

    fun getUserConsumerComponentBuilder():ConsumerComponent.Builder //here also have to define .Builder insted of .Factory
}