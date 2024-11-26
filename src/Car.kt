class Car {

    constructor(cor: String?, marca: String?){
        this.cor = cor
        this.marca = marca
    }

    private var cor: String? = null
    private var marca: String? = null

    fun Andar(){
        println("Carro $marca da cor $cor Andando...")
    }

    fun Parar(){
        println("Carro $marca da cor $cor Parando...")
    }
}