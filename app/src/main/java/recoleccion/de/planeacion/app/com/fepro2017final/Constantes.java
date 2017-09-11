package recoleccion.de.planeacion.app.com.fepro2017final;

/**
 * Created by Boui on 10/09/2017.
 */

public class Constantes {
    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;

    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
    private static final String PUERTO_HOST = "";

    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "https://recolector-basura.000webhostapp.com";
    /**
     * URLs del Web Service
     */
    public static final String INSERT_EMPLEADO = IP + PUERTO_HOST + "/insertar_empleado.php";
    public static final String GET_EMPLEADOS_CAMION_ACTIVO = IP + PUERTO_HOST + "/obtener_empleados_camion_activo.php";
    public static final String LOGIN_EMPLEADO = IP + PUERTO_HOST + "/login_empleado.php";
    //public static final String GET_CAMIONES = IP + PUERTO_HOST + "/obtener_camiones.php";
    //public static final String GET_CAMIONES_BY_ID = IP + PUERTO_HOST + "/obtener_camion_por_id.php";

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";

}