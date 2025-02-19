package mapper

interface Mapper<in P,out R> {
    /**
     * Takes param with one type and transform it to another type. Example transform string to int.
     * Mapper should support mapping from any type to any type. Types from and to can be the same.
     * @param param input value to map to another type
     * @return mapped input value
     */
    fun map(param:P ):R
}