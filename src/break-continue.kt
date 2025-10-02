fun  main(){
    var range = 0

    while (range < 10){
        range ++
        if (range == 3){
            continue
        }
        if (range == 5) break
        println(range)
    }
}