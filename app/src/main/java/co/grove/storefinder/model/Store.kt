package co.grove.storefinder.model

data class Store(
    val storeName: String,
    val storeLocation: String,
    val address: String,
    val city: String,
    val state: String,
    val zip: String,
    val lat: Float,
    val long: Float,
    val county: String
) {

    companion object {
        fun createStoreFromCsvRow(row: Array<String>): Store {
            return Store(
                row[0],
                row[1],
                row[2],
                row[3],
                row[4],
                row[5],
                row[6].toFloat(),
                row[7].toFloat(),
                row[8]
            )
        }
    }
}
