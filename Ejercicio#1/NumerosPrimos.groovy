long time_start, time_end

time_start = System.currentTimeMillis()

(2..100).each { numPrimo ->  
        if (numPrimo % 2 != 0 && numPrimo % 3 != 0 && numPrimo % 5 != 0 && numPrimo % 7 != 0){
            println "Numero Primo $numPrimo"
        }
        else {
             if (numPrimo == 2) println "Numero Primo $numPrimo"
             if (numPrimo == 3) println "Numero Primo $numPrimo"
             if (numPrimo == 5) println "Numero Primo $numPrimo"
             if (numPrimo == 7) println "Numero Primo $numPrimo"
        }
    }
    time_end = System.currentTimeMillis()

    println "Tiempo de ejecucion: " + (time_end - time_start) + " milisegundos"