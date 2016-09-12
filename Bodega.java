package problemabodega;

public class Bodega {
	
	static final int CAP_MAXIMA = 200;
	static final int TIPO_1 = 1;
	static final int TIPO_2 = 2;
	static final int VOL_TIPO_1 = 10;
	static final int VOL_TIPO_2 = 15;
	int capacidadActual;
	
	public Bodega() {
		capacidadActual = 0;
	}
	
	public void descargarArticulo(int tipo) {
		if(tipo == TIPO_1){
			while (capacidadActual >= CAP_MAXIMA - VOL_TIPO_1);
			capacidadActual += VOL_TIPO_1;
		} else if (tipo == TIPO_2){
			while (capacidadActual >= CAP_MAXIMA - VOL_TIPO_2);
			capacidadActual += VOL_TIPO_2;
		}
	}
	
	public int crearPaquete() {
		while (capacidadActual >= 90);
		int art_tipo1 = 3 * VOL_TIPO_1;
		int art_tipo2 = 4 * VOL_TIPO_2;
		return art_tipo1 + art_tipo2;
	}
}
