package com.danrusu.pods4k.immutableArrays

import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isA
import strikt.assertions.isEqualTo

private val primitiveDoubleClass = 3.0::class.java

/**
 * IMPORTANT:
 * Read TESTING-STRATEGY.md before modifying this file.
 */
class ImmutableDoubleArrayTest {
    @Test
    fun `ensure that primitive class variable is correct`() {
        expectThat(primitiveDoubleClass.toString()).isEqualTo("double")
    }

    @Test
    fun `creation type validation`() {
        expectThat(ImmutableDoubleArray(1) { it.toDouble() })
            .isA<ImmutableDoubleArray>()
    }

    @Test
    fun `get primitive type validation`() {
        with(ImmutableDoubleArray(1) { it.toDouble() }) {
            expectThat(get(0)::class.java).isEqualTo(primitiveDoubleClass)
        }
    }

    @Test
    fun `componentN function primitive type validation`() {
        val values = ImmutableDoubleArray(1) { it.toDouble() }
        val (first) = values
        expectThat(first::class.java == primitiveDoubleClass)
    }

    @Test
    fun `single primitive type validation`() {
        with(ImmutableDoubleArray(1) { it.toDouble() }) {
            expectThat(this.single()::class.java).isEqualTo(primitiveDoubleClass)
        }
    }

    @Test
    fun `first primitive type validation`() {
        with(ImmutableDoubleArray(3) { it.toDouble() }) {
            expectThat(this.first()::class.java).isEqualTo(primitiveDoubleClass)
        }
    }

    @Test
    fun `last primitive type validation`() {
        with(ImmutableDoubleArray(3) { it.toDouble() }) {
            expectThat(this.last()::class.java).isEqualTo(primitiveDoubleClass)
        }
    }

    @Test
    fun `iteration primitive type validation`() {
        with(ImmutableDoubleArray(3) { it.toDouble() }) {
            for (value in this) {
                expectThat(value::class.java).isEqualTo(primitiveDoubleClass)
            }
        }
    }

    @Test
    fun `forEach primitive type validation`() {
        with(ImmutableDoubleArray(3) { it.toDouble() }) {
            this.forEach { element ->
                expectThat(element::class.java).isEqualTo(primitiveDoubleClass)
            }
        }
    }

    @Test
    fun `forEachIndexed primitive type validation`() {
        with(ImmutableDoubleArray(3) { it.toDouble() }) {
            this.forEachIndexed { _, element ->
                expectThat(element::class.java).isEqualTo(primitiveDoubleClass)
            }
        }
    }
}
