import java.util.ArrayList;

/**
 * IModoRadio
 */
public interface IModoRadio {
    /**
     * Cambia la banda a AM.
     */
    void cambiarA_AM();

    /**
     * Cambia la banda a FM.
     */
    void cambiarA_FM();

    /**
     * Cambia de emisora a una superior por DELTA_EMISORA.
     */
    void subirEmisora();

    /**
     * Cambia la emisora a una inferior por DELTA_EMISORA.
     */
    void bajarEmisora();

    /**
     * 
     * @return La emisora que esta reproduciendo actualmente.
     */
    float obtenerEmisoraActual();

    /**
     * 
     * @return Las emisoras guardadas.
     */
    ArrayList<Float> obtenerEmisorasGuardadas();

    /**
     * Obtiene la posición de la emisora dentro de las emisoras guardadas por el
     * usuario. Devuelve -1 si la emisora no está guardada.
     * 
     * @param emisora que se quiere obtener su posición
     * @return La posición de la emisora dentro de las guardadas por el usuario.
     */
    int obtenerPosicionEmisora(float emisora);

    /**
     * Guarda la emisora actual.
     */
    void guardarEmisoraActual();

    /**
     * Carga la emisora guardada en la posición solicitada.
     * 
     * @param posicion de la emisora a cargar.
     */
    void cargarEmisora(int posicion);
}