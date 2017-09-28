public class Mujer{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
	/**
	*Costructor sobrecargado de la clase Mujer
	*@param p_nombre dato de tipo String
	*@param p_apellido dato de tipo String
	*@param p_edad dato de tipo int
	*/
    public Mujer(String p_nombre, String p_apellido, int p_edad){
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEstadoCivil("Soltera");
    }
    
	/**
	*Costructor de la clase Mujer
	*@param p_nombre dato de tipo String
	*@param p_apellido dato de tipo String
	*@param p_edad dato de tipo int
	*@param p_esposo objeto de tipo Hombre
	*/
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.casarseCon(p_esposo);
    this.setEstadoCivil("Casada");
    }
    
	//Inicio de los mutadores
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    //Fin de los mutadores
	
	//Inicio de los observadores
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    public Hombre getEsposo(){
        return this.esposo;
    }
    //Fin de los observadores
	
	
	/**
	*El metodo casarse con verifica que el objeto este soltero para luego poder
	*casarlo con otro objeto de tipo Hombre, cambiar su estadoCivil a casada
	*y mandar un mensaje al metodo casarseCon del objeto Hombre.
	*@param p_hombre objeto de tipo Hombre
	*/
    public void casarseCon(Hombre p_hombre){
        if(this.getEsposo() == null){
            this.setEsposo(p_hombre);
            this.setEstadoCivil("Casada");
            if(p_hombre.getEsposa() == null){
            p_hombre.casarseCon(this);
            }
        }
    }
    
	/**
	*El metodo divorcio verifica si el objeto esta casada para luego poder divorciarla
	*y mandar un mensaje a divorcio del objeto Hombre con la cual esta casada.
	*/
    public void divorcio(){
        if(this.getEsposo() != null){
            Hombre aux = this.getEsposo();
            this.setEsposo(null);
            this.setEstadoCivil("Divorciada");
            if (aux.getEsposa() != null){
            aux.divorcio();
            }
        }
    }
    
	/**
	*Retorna los datos del objeto como su nombre, apellido y edad
	*@return un dato de tipo String
	*/
    public String datos(){
        return this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años";
    }
    
	/**
	*Imprime por pantalla el metodo datos junto con el estado civil del objeto
	*/
    public void mostrarEstadoCivil(){
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }
    
	/**
	*Imprime por pantalla el metodo dato de el objeto y los datos de su esposo
	*/
    public void casadaCon(){
        System.out.println(this.datos() + " está casada con " + this.getEsposo().datos());
    }
}