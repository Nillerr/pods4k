// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import java.lang.OutOfMemoryError
import java.util.Arrays
import java.util.Comparator
import kotlin.Array
import kotlin.Boolean
import kotlin.Comparable
import kotlin.Float
import kotlin.FloatArray
import kotlin.Int
import kotlin.PublishedApi
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
public value class ImmutableFloatArray @PublishedApi internal constructor(
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
    internal val values: FloatArray,
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

    public operator fun equals(other: ImmutableFloatArray): Boolean {
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
     * See [FloatArray.isEmpty]
     */
    public inline fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [FloatArray.isNotEmpty]
     */
    public inline fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    public inline operator fun `get`(index: Int): Float = values[index]

    /**
     * See [FloatArray.getOrNull]
     */
    public inline fun getOrNull(index: Int): Float? = values.getOrNull(index)

    public operator fun component1(): Float = get(0)

    public operator fun component2(): Float = get(1)

    public operator fun component3(): Float = get(2)

    public operator fun component4(): Float = get(3)

    public operator fun component5(): Float = get(4)

    /**
     * See [FloatArray.single]
     */
    public inline fun single(): Float = values.single()

    /**
     * See [FloatArray.single]
     */
    public inline fun single(predicate: (element: Float) -> Boolean): Float =
            values.single(predicate)

    /**
     * See [FloatArray.singleOrNull]
     */
    public inline fun singleOrNull(): Float? = values.singleOrNull()

    /**
     * See [FloatArray.singleOrNull]
     */
    public inline fun singleOrNull(predicate: (element: Float) -> Boolean): Float? =
            values.singleOrNull(predicate)

    /**
     * See [FloatArray.first]
     */
    public inline fun first(): Float = values.first()

    /**
     * See [FloatArray.first]
     */
    public inline fun first(predicate: (element: Float) -> Boolean): Float = values.first(predicate)

    /**
     * See [FloatArray.firstOrNull]
     */
    public inline fun firstOrNull(): Float? = values.firstOrNull()

    /**
     * See [FloatArray.firstOrNull]
     */
    public inline fun firstOrNull(predicate: (element: Float) -> Boolean): Float? =
            values.firstOrNull(predicate)

    /**
     * See [FloatArray.last]
     */
    public inline fun last(): Float = values.last()

    /**
     * See [FloatArray.last]
     */
    public inline fun last(predicate: (element: Float) -> Boolean): Float = values.last(predicate)

    /**
     * See [FloatArray.lastOrNull]
     */
    public inline fun lastOrNull(): Float? = values.lastOrNull()

    /**
     * See [FloatArray.lastOrNull]
     */
    public inline fun lastOrNull(predicate: (element: Float) -> Boolean): Float? =
            values.lastOrNull(predicate)

    /**
     * See [FloatArray.iterator]
     */
    public inline operator fun iterator(): Iterator<Float> = values.iterator()

    /**
     * See [FloatArray.asIterable]
     */
    public inline fun asIterable(): Iterable<Float> = values.asIterable()

    /**
     * See [FloatArray.withIndex]
     */
    public inline fun withIndex(): Iterable<IndexedValue<Float>> = values.withIndex()

    /**
     * See [FloatArray.asSequence]
     */
    public inline fun asSequence(): Sequence<Float> = values.asSequence()

    /**
     * See [FloatArray.forEach]
     */
    public inline fun forEach(action: (element: Float) -> Unit): Unit = values.forEach(action)

    /**
     * See [FloatArray.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: Float) -> Unit): Unit =
            values.forEachIndexed(action)

    /**
     * See [FloatArray.all]
     */
    public inline fun all(predicate: (predicate: Float) -> Boolean): Boolean = values.all(predicate)

    /**
     * Leaves this immutable array as is and returns an ImmutableFloatArray with all elements sorted
     * according to the natural sort order of the value returned by the [selector].
     *
     * The sort is _stable_ so equal elements preserve their order relative to each other after
     * sorting.
     */
    public inline fun <R : Comparable<R>> sortedBy(crossinline selector: (element: Float) -> R?):
            ImmutableFloatArray = sortedWith(compareBy(selector))

    /**
     * Leaves this immutable array as is and returns an ImmutableFloatArray with all elements sorted
     * according to the reverse natural sort order of the value returned by the [selector].
     *
     * The sort is _stable_ so equal elements preserve their order relative to each other after
     * sorting.
     */
    public inline fun <R : Comparable<R>> sortedByDescending(crossinline
            selector: (element: Float) -> R?): ImmutableFloatArray =
            sortedWith(compareByDescending(selector))

    /**
     * Leaves this immutable array as is and returns an [ImmutableFloatArray] with all elements
     * sorted according to the specified [comparator].
     */
    public fun sortedWith(comparator: Comparator<in Float>): ImmutableFloatArray {
        // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
        if (size <= 1) return this

        val temp = values.toTypedArray()
        Arrays.sort(temp, comparator)
        return temp.toImmutableArray()
    }

    public companion object {
        @PublishedApi
        internal val EMPTY: ImmutableFloatArray = ImmutableFloatArray(FloatArray(0))

        /**
         * Returns an ImmutableFloatArray instance of the specified [size], where each element is
         * calculated by calling the specified [init] function.
         *
         * [init] is called sequentially starting at index 0 to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke method instead of a regular constructor so that we can declare it
         * inline.  The call site will look like a regular constructor call.
         */
        public inline operator fun invoke(size: Int, `init`: (index: Int) -> Float):
                ImmutableFloatArray {
            if (size == 0) return EMPTY

            val backingArray = FloatArray(size) { index -> init(index) }
            return ImmutableFloatArray(backingArray)
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

        private var values: FloatArray = FloatArray(initialCapacity)

        public fun add(element: Float) {
            ensureCapacity(size + 1)
            values[size++] = element
        }

        /**
         * Adds the [element] to the builder.
         */
        public operator fun plusAssign(element: Float) {
            add(element)
        }

        public fun addAll(elements: FloatArray) {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements, 0, values, size, elements.size)
            size += elements.size
        }

        public fun addAll(elements: Array<Float>) {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
        }

        public fun addAll(elements: ImmutableFloatArray) {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements.values, 0, values, size, elements.size)
            size += elements.size
        }

        public fun addAll(elements: ImmutableArray<Float>) {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
        }

        public fun addAll(elements: Iterable<Float>) {
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
        public fun build(): ImmutableFloatArray {
            if (size == 0) return EMPTY

            val backingArray = FloatArray(size)
            System.arraycopy(values, 0, backingArray, 0, size)
            return ImmutableFloatArray(backingArray)
        }

        private fun ensureCapacity(minCapacity: Int) {
            when {
                minCapacity < 0 -> throw OutOfMemoryError() // overflow
                values.size >= minCapacity -> return
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
            val replacement = FloatArray(newSize)
            System.arraycopy(values, 0, replacement, 0, size)
            values = replacement
        }
    }
}
