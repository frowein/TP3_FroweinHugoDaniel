public class Hombre{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
	/**
	*Costructor sobrecargado de la clase Hombre
	*@param p_nombre dato de tipo String
	*@param p_apellido dato de tipo String
	*@param p_edad dato de tipo int
	*/
    public Hombre(String p_nombre, String p_apellido, int p_edad){
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.setEstadoCivil("Soltero");
    }
    
	/**
	*Costructor de la clase Hombre
	*@param p_nombre dato de tipo String
	*@param p_apellido dato de tipo String
	*@param p_edad dato de tipo int
	*@param p_esposa objeto de tipo Mujer
	*/
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setEdad(p_edad);
    this.casarseCon(p_esposa);
    this.setEstadoCivil("Casado");
    }
    
	//Inicio de los mutadores
    private void setNombre(String p_nombre){
        this.nombre = p_nombre
        ;
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
    
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
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
    
    public Mujer getEsposa(){
        return this.esposa;
    }
    //Fin de los observadores
	
	/**
	*El metodo casarse con verifica que el objeto este soltero para luego poder
	*casarlo con otro objeto de tipo Mujer, cambiar su estadoCivil a casada
	*y mandar un mensaje al metodo casarseCon del objeto Mujer.
	*@param p_mujer objeto de tipo Mujer
	*/
    public void casarseCon(Mujer p_mujer){
        if(this.getEsposa() == null){
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
        if(p_mujer.getEsposo() == null){
        p_mujer.casarseCon(this); 
        }
        }
    }
    
	/**
	*El metodo divorcio verifica si el objeto esta casado para luego poder divorciarlo
	*y mandar un mensaje a divorcio del objeto Mujer con el cual esta casado.
	*/
    public void divorcio(){
        if(this.getEsposa() != null){
            Mujer aux = this.getEsposa();
			this.setEsposa(null);
            this.setEstadoCivil("Divorciado");
            if (aux.getEsposo() != null){
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
	*Imprime por pantalla el metodo dato de el objeto y los datos de su esposa
	*/
    public void casadoCon(){
        System.out.println(this.datos() + " está casado con " + this.getEsposa().datos());
    }
}