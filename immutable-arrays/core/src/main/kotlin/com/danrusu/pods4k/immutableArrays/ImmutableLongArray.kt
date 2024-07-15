// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import java.lang.OutOfMemoryError
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Char
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
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
public value class ImmutableLongArray @PublishedApi internal constructor(
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
    internal val values: LongArray,
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

    public operator fun equals(other: ImmutableLongArray): Boolean {
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
     * See [LongArray.isEmpty]
     */
    public inline fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [LongArray.isNotEmpty]
     */
    public inline fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    public inline operator fun `get`(index: Int): Long = values[index]

    /**
     * See [LongArray.getOrNull]
     */
    public inline fun getOrNull(index: Int): Long? = values.getOrNull(index)

    public operator fun component1(): Long = get(0)

    public operator fun component2(): Long = get(1)

    public operator fun component3(): Long = get(2)

    public operator fun component4(): Long = get(3)

    public operator fun component5(): Long = get(4)

    /**
     * See [LongArray.single]
     */
    public inline fun single(): Long = values.single()

    /**
     * See [LongArray.single]
     */
    public inline fun single(predicate: (element: Long) -> Boolean): Long = values.single(predicate)

    /**
     * See [LongArray.singleOrNull]
     */
    public inline fun singleOrNull(): Long? = values.singleOrNull()

    /**
     * See [LongArray.singleOrNull]
     */
    public inline fun singleOrNull(predicate: (element: Long) -> Boolean): Long? =
            values.singleOrNull(predicate)

    /**
     * See [LongArray.first]
     */
    public inline fun first(): Long = values.first()

    /**
     * See [LongArray.first]
     */
    public inline fun first(predicate: (element: Long) -> Boolean): Long = values.first(predicate)

    /**
     * See [LongArray.firstOrNull]
     */
    public inline fun firstOrNull(): Long? = values.firstOrNull()

    /**
     * See [LongArray.firstOrNull]
     */
    public inline fun firstOrNull(predicate: (element: Long) -> Boolean): Long? =
            values.firstOrNull(predicate)

    /**
     * See [LongArray.last]
     */
    public inline fun last(): Long = values.last()

    /**
     * See [LongArray.last]
     */
    public inline fun last(predicate: (element: Long) -> Boolean): Long = values.last(predicate)

    /**
     * See [LongArray.lastOrNull]
     */
    public inline fun lastOrNull(): Long? = values.lastOrNull()

    /**
     * See [LongArray.lastOrNull]
     */
    public inline fun lastOrNull(predicate: (element: Long) -> Boolean): Long? =
            values.lastOrNull(predicate)

    /**
     * See [LongArray.iterator]
     */
    public inline operator fun iterator(): Iterator<Long> = values.iterator()

    /**
     * See [LongArray.asIterable]
     */
    public inline fun asIterable(): Iterable<Long> = values.asIterable()

    /**
     * See [LongArray.withIndex]
     */
    public inline fun withIndex(): Iterable<IndexedValue<Long>> = values.withIndex()

    /**
     * See [LongArray.asSequence]
     */
    public inline fun asSequence(): Sequence<Long> = values.asSequence()

    /**
     * See [LongArray.forEach]
     */
    public inline fun forEach(action: (element: Long) -> Unit): Unit = values.forEach(action)

    /**
     * See [LongArray.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: Long) -> Unit): Unit =
            values.forEachIndexed(action)

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun <R> mapIndexed(transform: (index: Int, element: Long) -> R): ImmutableArray<R>
            = ImmutableArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Long) -> Boolean):
            ImmutableBooleanArray = ImmutableBooleanArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Long) -> Byte): ImmutableByteArray
            = ImmutableByteArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Long) -> Char): ImmutableCharArray
            = ImmutableCharArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Long) -> Short):
            ImmutableShortArray = ImmutableShortArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Long) -> Int): ImmutableIntArray =
            ImmutableIntArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Long) -> Long): ImmutableLongArray
            = ImmutableLongArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Long) -> Float):
            ImmutableFloatArray = ImmutableFloatArray(size) { transform(it, get(it)) }

    /**
     * Returns an immutable array containing the results of applying the given [transform] function
     * to each element and its index.
     */
    @OverloadResolutionByLambdaReturnType
    public inline fun mapIndexed(transform: (index: Int, element: Long) -> Double):
            ImmutableDoubleArray = ImmutableDoubleArray(size) { transform(it, get(it)) }

    public companion object {
        @PublishedApi
        internal val EMPTY: ImmutableLongArray = ImmutableLongArray(LongArray(0))

        /**
         * Returns an ImmutableLongArray instance of the specified [size], where each element is
         * calculated by calling the specified [init] function.
         *
         * [init] is called sequentially starting at index 0 to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke method instead of a regular constructor so that we can declare it
         * inline.  The call site will look like a regular constructor call.
         */
        public inline operator fun invoke(size: Int, `init`: (index: Int) -> Long):
                ImmutableLongArray {
            if (size == 0) return EMPTY

            val backingArray = LongArray(size) { index -> init(index) }
            return ImmutableLongArray(backingArray)
        }
    }

    /**
     * Builder to construct immutable arrays when the resulting size isn't known in advance.
     *
     * @param initialCapacity The initial capacity of the temporary array where the values are
     * accumulated.  A larger value reduces the number of times it's resized as elements get added.
     */
    public class Builder(
        initialCapacity: Int = 10,
    ) {
        public var size: Int = 0
            private set

        private var values: LongArray = LongArray(initialCapacity)

        public fun add(element: Long) {
            ensureCapacity(size + 1)
            values[size++] = element
        }

        /**
         * Adds the [element] to the builder.
         */
        public operator fun plusAssign(element: Long) {
            add(element)
        }

        public fun addAll(elements: LongArray) {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements, 0, values, size, elements.size)
            size += elements.size
        }

        public fun addAll(elements: Array<Long>) {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
        }

        public fun addAll(elements: ImmutableLongArray) {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements.values, 0, values, size, elements.size)
            size += elements.size
        }

        public fun addAll(elements: ImmutableArray<Long>) {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
        }

        public fun addAll(elements: Iterable<Long>) {
            if (elements is Collection) {
                ensureCapacity(size + elements.size)
                for (element in elements) {
                    values[size++] = element
                }
                return
            }
            for (element in elements) {
                add(element)
            }
        }

        /**
         * Returns an immutable array containing the elements that were added.
         */
        @Suppress("UNCHECKED_CAST")
        public fun build(): ImmutableLongArray {
            if (size == 0) return EMPTY

            val backingArray = LongArray(size)
            System.arraycopy(values, 0, backingArray, 0, size)
            return ImmutableLongArray(backingArray)
        }

        private fun ensureCapacity(minCapacity: Int) {
            when {
                values.size >= minCapacity -> return
                minCapacity < 0 -> throw OutOfMemoryError() // overflow
                // Some VMs reserve header words in the array so this is the max safe value
                minCapacity > Int.MAX_VALUE - 8 -> throw OutOfMemoryError()
            }
            // increase the size by 50 percent
            var newSize = values.size + (values.size shr 1) + 1
            newSize = when {
                newSize < 0 -> Int.MAX_VALUE - 8 // overflow
                newSize < minCapacity -> minCapacity
                else -> newSize
            }
            val replacement = LongArray(newSize)
            System.arraycopy(values, 0, replacement, 0, size)
            values = replacement
        }
    }
}
