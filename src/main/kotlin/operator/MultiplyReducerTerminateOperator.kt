package operator

/**
 * Class that takes Int and produce Int.
 */
class MultiplyReducerTerminateOperator : TerminateOperator<Int,Int> {
    /**
     * Method that reduces input sequence to single integer that equal to consequent multiplication of each value of sequence.
     * In case of empty sequence return 0.
     * @param param input sequence to terminate
     * @return value that equal to consequent multiplication of each sequence item
     */
    override fun terminate(param: Sequence<Int>): Int {
        if (param.toList().isEmpty()) {
            return 0
        }
        return param.fold(1) { acc, value -> acc * value }
    }

}