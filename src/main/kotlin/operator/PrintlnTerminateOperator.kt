package operator

/**
 * Class that can take any type and produce Unit.
 */
class PrintlnTerminateOperator<T> : TerminateOperator<Any,Unit> {
    /**
     * Method that terminate input sequence and println each value to console using println method
     * @param param input sequence to terminate
     * @return Unit
     */
    override fun terminate(param: Sequence<Number>): Unit {
        param.forEach { println(it) }
    }
}