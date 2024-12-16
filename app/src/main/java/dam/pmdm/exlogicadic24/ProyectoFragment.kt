package dam.pmdm.exlogicadic24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.fragment.app.Fragment

private const val PESOTOTAL = 30

class ProyectoFragment : Fragment() {
    private lateinit var spinner: Spinner
    private lateinit var calcular: Button
    private lateinit var total: EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_proyecto, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //bind
        spinner = view.findViewById(R.id.spinner)
        calcular = view.findViewById(R.id.calcular)
        total = view.findViewById(R.id.total)

        val datos = arrayOf("MA", "E", "Y", "G", "D")


    }

    /**
     * Formatea un número FLOAT a un string con dos decimales.
     *
     * @param num El número tipo FLOAT a formatear.
     * @return Un String que representa el número con dos decimales.
     */
    fun formatearFloat(num: Float): String {
        return String.format("%.2f", num)
    }

    /**
     * Calcula la probabilidad en porcentaje.
     *
     * @param peso Peso del item.
     * @return La probabilidad como un número flotante entre 0 y 100.
     */
    fun calcularProbabilidad(peso: Int): Float {
        return (peso.toFloat() / PESOTOTAL * 100)
    }

    /**
     * Calcula cuántos proyectos le corresponden en base a su peso.
     *
     * @param peso Peso del item.
     * @param total El total de proyectos a distribuir.
     * @return El número de proyectos asignados, como un número flotante.
     */
    fun calcularProyectos(peso: Int, total: Int): Float {
        return (peso.toFloat() * total / PESOTOTAL)
    }
}
