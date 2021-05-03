package org.d3if4027.galerihewan.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if4027.galerihewan.Hewan
import org.d3if4027.galerihewan.R

class MainViewModel : ViewModel() {

    private val data = MutableLiveData<List<Hewan>>()

    init {
        data.value = initData()
    }

    // Data ini akan kita ambil dari server di langkah selanjutnya
    private fun initData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor","Unggas", R.drawable.angsa),
            Hewan("Ayam", "Gallus gallus","Unggas", R.drawable.ayam),
            Hewan("Bebek", "Cairina moschata","Unggas", R.drawable.bebek),
            Hewan("Domba", "Ovis ammon","Mamalia", R.drawable.domba),
            Hewan("Kalkun", "Meleagris gallopavo","Unggas", R.drawable.kalkun),
            Hewan("Kambing", "Capricornis sumatrensis","Mamalia", R.drawable.kambing),
            Hewan("Kelinci", "Oryctolagus cuniculus","Mamalia", R.drawable.kelinci),
            Hewan("Kerbau", "Bubalus bubalis","Mamalia", R.drawable.kerbau),
            Hewan("Kuda", "Equus caballus","Mamalia", R.drawable.kuda),
            Hewan("Sapi", "Bos taurus","Mamalia", R.drawable.sapi)

        )
    }
    fun getData(): LiveData<List<Hewan>> = data
}