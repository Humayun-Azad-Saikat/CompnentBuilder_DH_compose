package com.example.componentbuilder_dh_compose

import com.example.componentbuilder_dh_compose.modules.NotificaionServiceModule
import com.example.componentbuilder_dh_compose.modules.UserRepositoryModule
import com.example.componentbuilder_dh_compose.qualifiers.ActivityScope
import dagger.BindsInstance
import dagger.Subcomponent


//this is subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificaionServiceModule::class])
interface ConsumerComponent {

    fun injectMainAC(mainActivity: MainActivity)

    fun getEmailservice(): EmailService


    @Subcomponent.Builder
    interface Builder{

        fun build():ConsumerComponent
        fun retryCount(@BindsInstance retryCount: Int):Builder
    }

    //builder works same as factory

    /**
     * steps:
     * ->@Component.Builder or @Subcomponent.Builder
     * ->have to define a bind mathod that will return component
     * ->have to create methods of the corrosponding parameters that will return Builder
     */

}