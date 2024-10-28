// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import java.util.Arrays
import java.util.Comparator
import kotlin.Array
import kotlin.Boolean
import kotlin.CharSequence
import kotlin.Comparable
import kotlin.Int
import kotlin.IntArray
import kotlin.Pair
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
 * To preserve the same performance as regular arrays, all functions that simply delegate to the
 * same function on the backing array are marked inline.  This won't result in code duplication as it's
 * a direct substitution replacing calls to the wrapper with direct calls to the underlying functions
 * on the backing array.
 */
@Suppress("NOTHING_TO_INLINE")
@JvmInline
public value class ImmutableIntArray @PublishedApi internal constructor(
    /**
     * The backing array is internal instead of private so that we can have inline functions that
     * delegate to the same function on the backing array.  The backing array won't be accessible from
     * Kotlin code since the auto-generated arrays are in their own module and the internal modifier
     * prevents outside access.  The constructor is also internal preventing anyone from creating an
     * "instance" that points to an array that they have access to.
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
    internal val values: IntArray,
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

    /**
     * See [IntArray.joinToString]
     */
    public fun joinToString(
        separator: CharSequence = ", ",
        prefix: CharSequence = "",
        postfix: CharSequence = "",
        limit: Int = -1,
        truncated: CharSequence = "...",
        transform: ((element: Int) -> CharSequence)? = null,
    ): String = values.joinToString(separator, prefix, postfix, limit, truncated, transform)

    public operator fun equals(other: ImmutableIntArray): Boolean {
        if (other.values === this.values) return true
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
     * See [IntArray.isEmpty]
     */
    public inline fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [IntArray.isNotEmpty]
     */
    public inline fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at [index]. This method can be called using the index operator.
     */
    public inline operator fun `get`(index: Int): Int = values[index]

    /**
     * See [IntArray.getOrNull]
     */
    public inline fun getOrNull(index: Int): Int? = values.getOrNull(index)

    public operator fun component1(): Int = get(0)

    public operator fun component2(): Int = get(1)

    public operator fun component3(): Int = get(2)

    public operator fun component4(): Int = get(3)

    public operator fun component5(): Int = get(4)

    /**
     * See [IntArray.single]
     */
    public inline fun single(): Int = values.single()

    /**
     * See [IntArray.single]
     */
    public inline fun single(predicate: (element: Int) -> Boolean): Int {
        return values.single(predicate)
    }

    /**
     * See [IntArray.singleOrNull]
     */
    public inline fun singleOrNull(): Int? = values.singleOrNull()

    /**
     * See [IntArray.singleOrNull]
     */
    public inline fun singleOrNull(predicate: (element: Int) -> Boolean): Int? {
        return values.singleOrNull(predicate)
    }

    /**
     * See [IntArray.first]
     */
    public inline fun first(): Int = values.first()

    /**
     * See [IntArray.first]
     */
    public inline fun first(predicate: (element: Int) -> Boolean): Int {
        return values.first(predicate)
    }

    /**
     * See [IntArray.firstOrNull]
     */
    public inline fun firstOrNull(): Int? = values.firstOrNull()

    /**
     * See [IntArray.firstOrNull]
     */
    public inline fun firstOrNull(predicate: (element: Int) -> Boolean): Int? {
        return values.firstOrNull(predicate)
    }

    /**
     * See [IntArray.last]
     */
    public inline fun last(): Int = values.last()

    /**
     * See [IntArray.last]
     */
    public inline fun last(predicate: (element: Int) -> Boolean): Int {
        return values.last(predicate)
    }

    /**
     * See [IntArray.lastOrNull]
     */
    public inline fun lastOrNull(): Int? = values.lastOrNull()

    /**
     * See [IntArray.lastOrNull]
     */
    public inline fun lastOrNull(predicate: (element: Int) -> Boolean): Int? {
        return values.lastOrNull(predicate)
    }

    /**
     * See [IntArray.iterator]
     */
    public inline operator fun iterator(): Iterator<Int> = values.iterator()

    /**
     * See [IntArray.asIterable]
     */
    public inline fun asIterable(): Iterable<Int> = values.asIterable()

    /**
     * See [IntArray.withIndex]
     */
    public inline fun withIndex(): Iterable<IndexedValue<Int>> = values.withIndex()

    /**
     * See [IntArray.asSequence]
     */
    public inline fun asSequence(): Sequence<Int> = values.asSequence()

    /**
     * See [IntArray.forEach]
     */
    public inline fun forEach(action: (element: Int) -> Unit) {
        values.forEach(action)
    }

    /**
     * See [IntArray.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: Int) -> Unit) {
        values.forEachIndexed(action)
    }

    /**
     * See [IntArray.all]
     */
    public inline fun all(predicate: (predicate: Int) -> Boolean): Boolean {
        return values.all(predicate)
    }

    /**
     * See [IntArray.any]
     */
    public inline fun any(predicate: (predicate: Int) -> Boolean): Boolean {
        return values.any(predicate)
    }

    /**
     * See [IntArray.none]
     */
    public inline fun none(predicate: (predicate: Int) -> Boolean): Boolean {
        return values.none(predicate)
    }

    /**
     * See [IntArray.count]
     */
    public inline fun count(predicate: (predicate: Int) -> Boolean): Int {
        return values.count(predicate)
    }

    /**
     * See [IntArray.indexOfFirst]
     */
    public inline fun indexOfFirst(predicate: (element: Int) -> Boolean): Int {
        return values.indexOfFirst(predicate)
    }

    /**
     * See [IntArray.indexOfLast]
     */
    public inline fun indexOfLast(predicate: (element: Int) -> Boolean): Int {
        return values.indexOfLast(predicate)
    }

    /**
     * Returns an immutable array containing the first [n] elements.
     *
     * @throws IllegalArgumentException if [n] is negative.
     */
    public fun take(n: Int): ImmutableIntArray {
        require(n >= 0) { "Requested element count $n is less than zero." }
        if (n == 0) return EMPTY
        if (n >= size) return this

        val backingArray = IntArray(n)
        System.arraycopy(values, 0, backingArray, 0, n)
        return ImmutableIntArray(backingArray)
    }

    /**
     * Returns an immutable array containing only the elements matching the given [predicate].
     */
    public inline fun filter(predicate: (element: Int) -> Boolean): ImmutableIntArray {
        val result = Builder()
        for (element in values) {
            if (predicate(element)) {
                result.add(element)
            }
        }
        return result.build()
    }

    /**
     * Returns an immutable array containing only the elements matching the given [predicate].
     */
    public inline fun filterIndexed(predicate: (index: Int, element: Int) -> Boolean): ImmutableIntArray {
        val result = Builder()
        forEachIndexed { index, element ->
            if (predicate(index, element)) {
                result.add(element)
            }
        }
        return result.build()
    }

    /**
     * Returns an immutable array containing only the elements that don't match the [predicate].
     */
    public inline fun filterNot(predicate: (element: Int) -> Boolean): ImmutableIntArray {
        val result = Builder()
        for (element in values) {
            if (!predicate(element)) {
                result.add(element)
            }
        }
        return result.build()
    }

    /**
     * Creates a pair of immutable arrays, where the first contains elements for which the predicate
     * yielded true, and the second contains the other elements.
     */
    public fun partition(predicate: (element: Int) -> Boolean): Pair<ImmutableIntArray, ImmutableIntArray> {
        var firstIndex = 0
        var secondIndex = size - 1
        val buffer = IntArray(size)
        for (element in values) {
            if (predicate(element)) {
                buffer[firstIndex] = element
                firstIndex++
            } else {
                buffer[secondIndex] = element
                secondIndex--
            }
        }
        val first = ImmutableIntArray(firstIndex) { buffer[it] }
        val second = ImmutableIntArray(size - first.size) { buffer[size - it - 1] }
        return Pair(first, second)
    }

    /**
     * Leaves this immutable array as is and returns an ImmutableIntArray with all elements sorted
     * according to the natural sort order of the value returned by the [selector].
     *
     * The sort is _stable_ so equal elements preserve their order relative to each other after
     * sorting.
     */
    public inline fun <R : Comparable<R>> sortedBy(crossinline selector: (element: Int) -> R?): ImmutableIntArray {
        return sortedWith(compareBy(selector))
    }

    /**
     * Leaves this immutable array as is and returns an ImmutableIntArray with all elements sorted
     * according to the reverse natural sort order of the value returned by the [selector].
     *
     * The sort is _stable_ so equal elements preserve their order relative to each other after
     * sorting.
     */
    public inline fun <R : Comparable<R>> sortedByDescending(crossinline selector: (element: Int) -> R?): ImmutableIntArray {
        return sortedWith(compareByDescending(selector))
    }

    /**
     * Leaves this immutable array as is and returns an [ImmutableIntArray] with all elements sorted
     * according to the specified [comparator].
     */
    public fun sortedWith(comparator: Comparator<in Int>): ImmutableIntArray {
        // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
        if (size <= 1) return this

        val temp = values.toTypedArray()
        Arrays.sort(temp, comparator)
        return temp.toImmutableArray()
    }

    public companion object {
        @PublishedApi
        internal val EMPTY: ImmutableIntArray = ImmutableIntArray(IntArray(0))

        /**
         * Returns an ImmutableIntArray instance of the specified [size], where each element is
         * calculated by calling the [init] function.
         *
         * [init] is called sequentially, starting at index 0, to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke operator instead of a regular constructor so that we can declare
         * it inline.  The call site will look like a regular constructor call.
         */
        public inline operator fun invoke(size: Int, `init`: (index: Int) -> Int): ImmutableIntArray {
            if (size == 0) return EMPTY

            val backingArray = IntArray(size) { index -> init(index) }
            return ImmutableIntArray(backingArray)
        }
    }

    /**
     * Builder to create immutable arrays when the resulting size isn't known in advance.
     *
     * @param initialCapacity The initial capacity of the temporary array where the values are
     * accumulated.  A larger value reduces the number of times it's resized as elements get added.
     */
    public class Builder(
        initialCapacity: Int = 10,
    ) {
        public var size: Int = 0
            private set

        private var values: IntArray = IntArray(initialCapacity)

        public fun add(element: Int): Builder {
            ensureCapacity(size + 1)
            values[size++] = element
            return this
        }

        /**
         * Adds the [element] to the builder.
         */
        public operator fun plusAssign(element: Int) {
            add(element)
        }

        public fun addAll(elements: IntArray): Builder {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements, 0, values, size, elements.size)
            size += elements.size
            return this
        }

        public fun addAll(elements: Array<Int>): Builder {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
            return this
        }

        public fun addAll(elements: ImmutableIntArray): Builder {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements.values, 0, values, size, elements.size)
            size += elements.size
            return this
        }

        public fun addAll(elements: ImmutableArray<Int>): Builder {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
            return this
        }

        public fun addAll(elements: Iterable<Int>): Builder {
            if (elements is Collection) {
                ensureCapacity(size + elements.size)
                for (element in elements) {
                    values[size++] = element
                }
                return this
            }
            for (element in elements) {
                add(element)
            }
            return this
        }

        public fun addAll(elements: Sequence<Int>): Builder {
            elements.forEach { add(it) }
            return this
        }

        /**
         * Returns an immutable array containing the elements that were added.
         */
        public fun build(): ImmutableIntArray {
            when (size) {
                0 -> return EMPTY
                values.size -> return ImmutableIntArray(values)
            }
            val backingArray = IntArray(size)
            System.arraycopy(values, 0, backingArray, 0, size)
            return ImmutableIntArray(backingArray)
        }

        private fun ensureCapacity(minCapacity: Int) {
            val newCapacity = BuilderUtils.computeNewCapacity(values.size, minCapacity)
            if (newCapacity == values.size) return

            val replacement = IntArray(newCapacity)
            System.arraycopy(values, 0, replacement, 0, size)
            values = replacement
        }
    }
}
