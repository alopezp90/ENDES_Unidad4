package gasolinera.mal;

public class GrupoDepositos {
	private String idGrupo;		   // identifica al grupo de depositos
	private int numeroDepositosGrupo; //de 1 a 3
	
	// Deposito 1
		private String idDeposito1;
		private float diametro1;
		private float altura1;
	// Deposito 2
		private String idDeposito2;
		private float diametro2;
		private float altura2;   
	// Deposito 3
		private String idDeposito3;
		private float diametro3;
		private float altura3;  
	
	// Constructor
	    public GrupoDepositos (int valor_numeroDeDepositosGrupo, String valor_idGrupo) {
	   
	    	idGrupo = valor_idGrupo; 
	    // valores por defecto de los depositos
	    switch (valor_numeroDeDepositosGrupo) {
	       case 1: System.out.println ("Un grupo ha de tener más de un depósito"); break;
	            
	       case 2:
	            setDeposito(1,10,5,"0000");
	            setDeposito(2,10,5,"0000");   
	            numeroDepositosGrupo = 2;
	            break;

	       case 3:
	    	    setDeposito(1,10,5,"0000");
	            setDeposito(2,10,5,"0000");   
	            setDeposito(2,10,5,"0000");   
	            numeroDepositosGrupo = 3;   
	            break;

	        default: System.out.println ("No se admiten más de tres depósitos");
	            
	            break;
	        } //Cierre del switch
	    } //Cierre del constructo
	  
	    public int getNumeroDepositosGrupo () { return numeroDepositosGrupo; } 
	    public String getIdGrupo () { return idGrupo; }	    
	    
	    public void setDeposito (int numero_deposito,float valor_diametro, float valor_altura, String valor_idDeposito) {
	        
	    	switch (numero_deposito) {
            case 1:
            	
	            diametro1 = valor_diametro;
	            altura1 = valor_altura;
	            idDeposito1 = valor_idDeposito;
	         break;    
            
            case 2:    
	            diametro2 = valor_diametro;
	            altura1 = valor_altura;
	            idDeposito1 = valor_idDeposito;
	         break;   
            	
            case 3:    
	            diametro3 = valor_diametro;
	            altura1 = valor_altura;
	            idDeposito1 = valor_idDeposito;
	         break;
            	
	         default:System.out.println ("ERROR AL ASIGNAR VALORES AL DEPOSITO");
	    	}
	    }	    
	    // get deposito
	    
public float getAltura (int numero_deposito) {
	        
	    	switch (numero_deposito) {
            case 1:
            	return altura1;
			case 2:    
	            return altura2;
	         case 3:    
	            return altura3;
          
	         default:System.out.println ("ERROR EN NÚMERO DE DEPOSITO");
	         return 0;
	         
	    	}
	    }	    
	    
public String getIddeposito (int numero_deposito) {
	        
	    	switch (numero_deposito) {
            case 1:
            	return idDeposito1;
			case 2:    
	            return idDeposito2;
	        case 3:    
	            return idDeposito3;
          
	         default:System.out.println ("ERROR EN NÚMERO DE DEPOSITO");
	         return "";
	         
	    	}
	    }
	    

public float getDiametro (int numero_deposito) {
    
	switch (numero_deposito) {
    case 1:
    	return diametro1;
	case 2:    
        return diametro2;
     case 3:    
        return diametro3;
  
     default:System.out.println ("ERROR EN NÚMERO DE DEPOSITO");
     return 0;
     
	}
}
	    
public float valorCapacidad (int numero_deposito) { //Método tipo función
	float capacidad;
	float pi = 3.1416f; //Si no incluimos la f el compilador considera que 3.1416 es double
	switch (numero_deposito) {
    case 1:
    	capacidad = pi * (diametro1/2) * (diametro1/2) * altura1;
    	return capacidad;
    
	case 2:    
		capacidad = pi * (diametro2/2) * (diametro2/2) * altura2;
    	return capacidad;
     case 3:    
    	 capacidad = pi * (diametro3/2) * (diametro3/2) * altura3;
     	return capacidad;
  
     default:System.out.println ("ERROR EN NÚMERO DE DEPOSITO");
     return 0;
     
	}
	
	}        
	    
public  float capacidadDelGrupo () {       //Este método usa objetos de otra clase e invoca métodos de otra clase
    if (numeroDepositosGrupo == 2) {
    	return (valorCapacidad(1) + valorCapacidad(2) );
    } else { 
    	return (valorCapacidad(1) + valorCapacidad(2)+ valorCapacidad(3) ); }
    
}          
	     
	    
public static void main(String[] args) {
	
	GrupoDepositos grupo1=new GrupoDepositos(3,"Grupo1");
	System.out.println (grupo1.capacidadDelGrupo ());
	}    
}