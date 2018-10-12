
public class TennisGame1 implements TennisGame {
    
    private int m_puntaje1 = 0;
    private int m_puntaje2 = 0;
    private String nombreJugador1;
    private String nombreJugador2;

    public TennisGame1(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == nombreJugador1)
            m_puntaje1 += 1;
        else
            m_puntaje2 += 1;
        
        
        
    }

    public String getPuntaje() {        
        if (m_puntaje1 == m_puntaje2)
        {
           return empateMensaje();
        }
        else if (m_puntaje1 >=4 || m_puntaje2 >=4)
        {
            return ventajaMensaje();
        }
        else
        {
        	return menorA3mensaje();
        }        
    }
    
    public String empateMensaje() {
    	String puntaje="";
    	switch (m_puntaje1)
         {
             case 0:
                     puntaje = "Amor-Todos";
                 break;
             case 1:
                     puntaje = "Quince-Todos";
                 break;
             case 2:
                     puntaje = "Treinta-Todos";
                 break;
             default:
                     puntaje = "Deuce";
                 break;
             
         }
    	return puntaje;
    }
    
    public String ventajaMensaje() {
    	String mensaje="";
    	int minusResult = m_puntaje1 - m_puntaje2;
        if (minusResult==1) mensaje ="Ventaja jugador1";
        else if (minusResult ==-1) mensaje ="Ventaja jugador2";
        else if (minusResult>=2) mensaje = "Gana jugador1";
        else mensaje ="Gana jugador2";
    	return mensaje;
    }
    
    public String menorA3mensaje() {
    	String mensaje="";
    	int tempPuntaje=0;
    	for (int i=1; i<3; i++)
        {
            if (i==1) tempPuntaje = m_puntaje1;
            else { mensaje+="-"; tempPuntaje = m_puntaje2;}
            switch(tempPuntaje)
            {
                case 0:
                    mensaje+="Amor";
                    break;
                case 1:
                    mensaje+="Quince";
                    break;
                case 2:
                    mensaje+="Treinta";
                    break;
                case 3:
                    mensaje+="Cuarenta";
                    break;
            }
        }
    	return mensaje;
    }
}
