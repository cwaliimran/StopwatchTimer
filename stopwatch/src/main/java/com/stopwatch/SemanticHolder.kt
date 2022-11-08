package com.stopwatch

internal class SemanticHolder(
    val millis: Long,
    val semantic: Semantic
) : Comparable<SemanticHolder> {

    override fun compareTo(other: SemanticHolder) = millis.compareTo(other.millis)
}
