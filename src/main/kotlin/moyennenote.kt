
fun somme(notes:Array<Double>):Double {
    var som:Double = 0.00;
    for(note in notes){
        som+=note
    }
    return som
}

fun average(somme: Double, length:Int):Double{
    return somme/length.toDouble()
}

fun main(args: Array<String>) {

    println("hello world")

    var notes : Array<Double> = emptyArray();
     var nbNotes : Int = 0;
    var note : Double = 0.0;

    while(note != -1.0){
        println("Valeur (-1 pour sortir, note comprise entre 0 et 20): ")
        note = readln().toDouble()
        if(note in 0.0..20.0){
            notes+=note
            nbNotes+=1
        }
    }

    var som = somme(notes)
    var moyenne = average(som,nbNotes)
    println("La moyenne est $moyenne")

}