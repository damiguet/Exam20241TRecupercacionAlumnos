package dam.pmdm.exlogicadic24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.SwitchCompat
import androidx.fragment.app.Fragment

class PMDMFragment :Fragment(){
    private lateinit var sw_all: SwitchCompat

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pmdm, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sw_all=view.findViewById(R.id.sw_all)

    }


    /**
     * Cambia la imagen de un `ImageView` según el estado booleano recibido.
     *
     * @param cambio Si es `true`, se asigna la imagen de "encendido" (`R.drawable.sw_on`).
     *               Si es `false`, se asigna la imagen de "apagado" (`R.drawable.sw_off`).
     * @param image  El `ImageView` al que se aplicará el cambio. Si es `null`, no se realiza ninguna acción.
     */
    private fun cambiarImagen(cambio: Boolean, image: ImageView?) {
        if(cambio){
            image?.setImageResource(R.drawable.sw_on)
        }else{
            image?.setImageResource(R.drawable.sw_off)
        }
    }

    /**
     * Verifica si todos los switches están activados. Si todos están activados,
     * activa el switch maestro (`sw_all`). De lo contrario, lo desactiva.
     */
    private fun checkSwitch() {
        //TODO implementa este metodo
    }

    /**
     * Configura el estado de los tres switches al valor proporcionado.
     *
     * @param b Si es `true`, todos los switches se marcan como seleccionados.
     *          Si es `false`, se desmarcan.
     */
    private fun checkAll(b: Boolean) {
        //TODO implementa este método
    }
}
