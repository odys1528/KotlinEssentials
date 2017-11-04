package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    val flowerTender = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("pruning a ${flower.name}")
    }

    val roseGarden = Garden2<Rose>(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(0)

    val daffodilGarden = Garden2<Daffodil>(listOf(Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(0)

}


class Daffodil: Flower("Daffodil")

interface  FlowerCare<in T> {  // contravariant, no return (opposite to covariance)
    fun prune(flower: T)
}

class Garden2<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}