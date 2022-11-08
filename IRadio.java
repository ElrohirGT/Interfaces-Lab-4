/**
 * IRadio
 */
public interface IRadio extends IModoRadio, IModoReproduccion, IModoTelefono, IModoProductividad {
    public final int DELTA_VOLUMEN = 1;
    public final float DELTA_EMISORA = 0.5f;
    public final int MAX_EMISORAS_GUARDADAS = 50;

    /**
     * Enciende la radio.
     */
    void encender();

    /**
     * Apaga la radio.
     */
    void apagar();

    /**
     * Aumenta el volumen de la radio de acuerdo a DELTA_VOLUMEN.
     */
    void aumentarVolumen();

    /**
     * Disminuye el volumen de la radio de acuerdo a DELTA_VOLUMEN.
     */
    void disminuirVolumen();

    /**
     * Cambia el modo de la radio al modo dado.
     * 
     * @param nuevoModo El modo al que se quiere cambiar la radio.
     */
    void cambiarModo(ModosRadio nuevoModo);

    /**
     * Obtiene el actual de la radio
     */
    ModosRadio obtenerModo();
}