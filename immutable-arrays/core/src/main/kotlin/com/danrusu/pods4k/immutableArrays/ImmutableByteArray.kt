// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import kotlin.Boolean
import kotlin.Byte
import kotlin.ByteArray
import kotlin.Char
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.OverloadResolutionByLambdaReturnType
import kotlin.PublishedApi
import kotlin.Short
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.IndexedValue
import kotlin.collections.Iterable
import kotlin.collections.Iterator
import kotlin.jvm.JvmInline
import kotlin.ranges.IntRange
import kotlin.sequences.Sequence

/**
 * Represents an array that cannot have its elements re-assigned.
 *
 * Although this is a class that wraps a regular array, it's really a zero-cost abstraction that
 * gets eliminated at compile time so that variables of this type end up pointing directly at the
 * underlying array.
 *
 * In order to preserve the same performance as regular arrays, all methods that delegate to the
 * same method on the backing array are marked with inline so that call sites end up calling the
 * underlying methods directly.  Note that this won't have any negative performance impacts as it
 * doesn't result in duplicate code or anything as it just replaces the wrapper method call with the
 * underlying method call.
 */
@Suppress("NOTHING_TO_INLINE")
@JvmInline
public value class ImmutableByteArray @PublishedApi internal constructor(
    /**
     * This is internal instead of private so we can have inline functions that delegate to the same
     * function on the backing array.  The backing array won't be accessible from Kotlin code since the
     * auto-generarted arrays are in their own module and the internal modifier prevents outside
     * access.  The constructor is also internal preventing anyone from creating an "instance" that
     * points to an array that they have access to.
     *
     * Attempting to bypass the internal visibility from java won't work since this is an inline
     * class so both the field and constructor are mangled by the Kotlin compiler.  While these might
     * appear to be accessible from Java due to the friendly Kotlin interop, these won't actually exist
     * with those names in the generated bytecode resulting in an unknown symbol exception.
     *
     * Therefore, the combination of being internal in its own module along with inline classes
     * makes this effectively private.
     */
    @PublishedApi
    internal val values: ByteArray,
) {
    public inline val size: Int
        get() = values.size

    /**
     * Returns the index of the last element or -1 if the array is empty.
     */
    public inline val lastIndex: Int
        get() = values.lastIndex

    /**
     * Returns the range of valid indices for the array.
     */
    public inline val indices: IntRange
        get() = values.indices

    override fun toString(): String = values.joinToString(prefix = "[", postfix = "]")

    public operator fun equals(other: ImmutableByteArray): Boolean {
        if (other.size != this.size) return false

        forEachIndexed { index, element ->
            if (other[index] != element) return false
        }
        return true
    }

    override fun hashCode(): Int {
        // Start with non-zero hash so that arrays that start with a different number of zero-hash elements end up with different hashCodes
        var hashCode = 7
        for (value in values) {
            hashCode = 31 * hashCode + value.hashCode()
        }
        return hashCode
    }

    /**
     * See [ByteArray.isEmpty]
     */
    public inline fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [ByteArray.isNotEmpty]
     */
    public inline fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    public inline operator fun `get`(index: Int): Byte = values[index]

    /**
     * See [ByteArray.getOrNull]
     */
    public inline fun getOrNull(index: Int): Byte? = values.getOrNull(index)

    public operator fun component1(): Byte = get(0)

    public operator fun component2(): Byte = get(1)

    public operator fun component3(): Byte = get(2)

    public operator fun component4(): Byte = get(3)

    public operator fun component5(): Byte = get(4)

    /**
     * See [ByteArray.single]
     */
    public inline fun single(): Byte = values.single()

    /**
     * See [ByteArray.single]
     */
    public inline fun single(predicate: (element: Byte) -> Boolean): Byte = values.single(predicate)

    /**
     * See [ByteArray.singleOrNull]
     */
    public inline fun singleOrNull(): Byte? = values.singleOrNull()

    /**
     * See [ByteArray.singleOrNull]
     */
    public inline fun singleOrNull(predicate: (element: Byte) -> Boolean): Byte? =
            values.singleOrNull(predicate)

    /**
     * See [ByteArray.first]
     */
    public inline fun first(): Byte = values.first()

    /**
     * See [ByteArray.first]
     */
    public inline fun first(predicate: (element: Byte) -> Boolean): Byte = values.first(predicate)

    /**
     * See [ByteArray.firstOrNull]
     */
    public inline fun firstOrNull(): Byte? = values.firstOrNull()

    /**
     * See [ByteArray.firstOrNull]
     */
    public inline fun firstOrNull(predicate: (element: Byte) -> Boolean): Byte? =
            values.firstOrNull(predicate)

    /**
     * See [ByteArray.last]
     */
    public inline fun last(): Byte = values.last()

    /**
     * See [ByteArray.last]
     */
    public inline fun last(predicate: (element: Byte) -> Boolean): Byte = values.last(predicate)

    /**
     * See [ByteArray.lastOrNull]
     */
    public inline fun lastOrNull(): Byte? = values.lastOrNull()

    /**
     * See [ByteArray.lastOrNull]
     */
    public inline fun lastOrNull(predicate: (element: Byte) -> Boolean): Byte? =
            values.lastOrNull(predicate)

    /**
     * See [ByteArray.iterator]
     */
    public inline operator fun iterator(): Iterator<Byte> = values.iterator()

    /**
     * See [ByteArray.asIterable]
     */
    public inline fun asIterable(): Iterable<Byte> = values.asIterable()

    /**
     * See [ByteArray.withIndex]
     */
    public inline fun withIndex(): Iterable<IndexedValue<Byte>> = values.withIndex()

    /**
     * See [ByteArray.asSequence]
     */
    public inline fun asSequence(): Sequence<Byte> = values.asSequence()

    /**
     * See [ByteArray.forEach]
     */
    public inline fun forEach(action: (element: Byte) -> Unit): Unit = values.forEach(action)

    /**
     * See [ByteArray.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: Byte) -> Unit): Unit =
            values.forEachIndexed(action)

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun <R> map(transform: (element: Byte) -> R): ImmutableArray<R> =
            ImmutableArray(size) { transform(get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun map(transform: (element: Byte) -> Boolean): ImmutableBooleanArray =
            ImmutableBooleanArray(size) { transform(get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun map(transform: (element: Byte) -> Byte): ImmutableByteArray =
            ImmutableByteArray(size) { transform(get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun map(transform: (element: Byte) -> Char): ImmutableCharArray =
            ImmutableCharArray(size) { transform(get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun map(transform: (element: Byte) -> Short): ImmutableShortArray =
            ImmutableShortArray(size) { transform(get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun map(transform: (element: Byte) -> Int): ImmutableIntArray =
            ImmutableIntArray(size) { transform(get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun map(transform: (element: Byte) -> Long): ImmutableLongArray =
            ImmutableLongArray(size) { transform(get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun map(transform: (element: Byte) -> Float): ImmutableFloatArray =
            ImmutableFloatArray(size) { transform(get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun map(transform: (element: Byte) -> Double): ImmutableDoubleArray =
            ImmutableDoubleArray(size) { transform(get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun <R> mapIndexed(transform: (index: Int, element: Byte) -> R): ImmutableArray<R>
            = ImmutableArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Byte) -> Boolean):
            ImmutableBooleanArray = ImmutableBooleanArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Byte) -> Byte): ImmutableByteArray
            = ImmutableByteArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Byte) -> Char): ImmutableCharArray
            = ImmutableCharArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Byte) -> Short):
            ImmutableShortArray = ImmutableShortArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Byte) -> Int): ImmutableIntArray =
            ImmutableIntArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Byte) -> Long): ImmutableLongArray
            = ImmutableLongArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Byte) -> Float):
            ImmutableFloatArray = ImmutableFloatArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Byte) -> Double):
            ImmutableDoubleArray = ImmutableDoubleArray(size) { transform(it, get(it)) }

    public companion object {
        @PublishedApi
        internal val EMPTY: ImmutableByteArray = ImmutableByteArray(ByteArray(0))

        /**
         * Returns an ImmutableByteArray instance of the specified [size], where each element is
         * calculated by calling the specified [init] function.
         *
         * [init] is called sequentially starting at index 0 to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke method instead of a regular constructor so that we can declare it
         * inline.  The call site will look like a regular constructor call.
         */
        public inline operator fun invoke(size: Int, `init`: (index: Int) -> Byte):
                ImmutableByteArray {
            if (size == 0) return EMPTY
            val backingArray = ByteArray(size) { index -> init(index) }
            return ImmutableByteArray(backingArray)
        }
    }
}
