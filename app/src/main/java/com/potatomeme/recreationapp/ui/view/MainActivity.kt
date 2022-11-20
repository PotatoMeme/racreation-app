package com.potatomeme.recreationapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.potatomeme.recreationapp.R
import com.potatomeme.recreationapp.data.repository.FlagRepositoryImpl
import com.potatomeme.recreationapp.data.repository.InfoRepositoryImpl
import com.potatomeme.recreationapp.databinding.ActivityMainBinding
import com.potatomeme.recreationapp.ui.viewmodel.MainViewModel
import com.potatomeme.recreationapp.ui.viewmodel.MainViewModelProviderFactory

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val flagRepositoryImpl = FlagRepositoryImpl()
        val infoRepositoryImpl = InfoRepositoryImpl()
        val factory = MainViewModelProviderFactory(flagRepositoryImpl,infoRepositoryImpl)
        viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        setupJetpackNavigation()
        binding.lifecycleOwner = this
    }

    private fun setupJetpackNavigation() {
        val host = supportFragmentManager
            .findFragmentById(R.id.cookingsearch_nav_host_fragment) as NavHostFragment? ?: return
        navController = host.navController

        appBarConfiguration = AppBarConfiguration(
            //navController.graph
            setOf(
                R.id.fragment_start
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}