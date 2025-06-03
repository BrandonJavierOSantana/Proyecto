package mx.tecnm.cdmadero.api.dtos

import mx.tecnm.cdmadero.api.entities.*

class DtoConsulta(
    val curpPaciente: String = "",
    val cedulaMedico: String = "",
    val consulta: ConsultaGeneral = ConsultaGeneral().apply {

        idHistoriaClinica = HistoriaClinica().apply {

            idExploracionFisica = ExploracionFisica().apply {
                idSignosVitales = SignosVitales()
            }

            idInterrogatorio = Interrogatorio()
        }

        idNotaDeEvolucion = NotaDeEvolucion().apply {
            idSignosVitales = SignosVitales()
            idTratamiento = Tratamiento()
        }

        idNotaDeTraslado = NotaDeReferenciaTraslado().apply {

        }

        idNotaDeInterconsulta = NotaDeInterconsulta().apply {
            idTratamiento = Tratamiento()
            idSignosVitales = SignosVitales()
            idExploracionFisica = ExploracionFisica()
        }
    }
)
