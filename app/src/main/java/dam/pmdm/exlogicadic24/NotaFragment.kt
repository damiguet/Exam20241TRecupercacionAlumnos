package dam.pmdm.exlogicadic24

import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class NotaFragment : Fragment() {
    private lateinit var notaEjercicios: EditText
    private lateinit var notaExamen: EditText
    private lateinit var notaTotal: TextView
    private lateinit var prefs: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nota, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //bind
        notaEjercicios = view.findViewById(R.id.nota_ejer)
        notaExamen = view.findViewById(R.id.nota_examen)
        notaTotal = view.findViewById(R.id.nota_total)
        prefs = requireContext().getSharedPreferences("Preferencias", MODE_PRIVATE)

    }
    /**
     * Calcula la media ponderada de las notas.
     *
     * @param ejercicios string con la nota de ejercicios
     * @param examen string con la nota de examen
     * @return Un string con "la nota calculada" / "Nota<5" / "BadValue"
     */
    private fun calcularTotal(ejercicios:String, examen:String):String {
        var nota:Float
        if(ejercicios.isNotBlank() && ejercicios.toFloat()>=5){
            if(examen.isNotBlank()&& notaExamen.text.toString().toFloat()>=5){
                nota= (ejercicios.toFloat()*0.35+examen.toFloat()*0.65).toFloat()
                if(nota>10){
                    return "BadValue"
                }else{
                    return String.format("%.2f", nota)
                }
            }else{
                return "Nota <5"
            }
        }else{
            return "Nota <5"
        }
    }
}
