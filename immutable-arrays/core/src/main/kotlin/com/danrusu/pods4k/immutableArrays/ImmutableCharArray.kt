// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import java.util.Arrays
import java.util.Comparator
import kotlin.Array
import kotlin.Boolean
import kotlin.Char
import kotlin.CharArray
import kotlin.CharSequence
import kotlin.Comparable
import kotlin.Int
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
public value class ImmutableCharArray @PublishedApi internal constructor(
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
    internal val values: CharArray,
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
     * See [CharArray.joinToString]
     */
    public fun joinToString(
        separator: CharSequence = ", ",
        prefix: CharSequence = "",
        postfix: CharSequence = "",
        limit: Int = -1,
        truncated: CharSequence = "...",
        transform: ((element: Char) -> CharSequence)? = null,
    ): String = values.joinToString(separator, prefix, postfix, limit, truncated, transform)

    public operator fun equals(other: ImmutableCharArray): Boolean {
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
     * See [CharArray.isEmpty]
     */
    public inline fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [CharArray.isNotEmpty]
     */
    public inline fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at [index]. This method can be called using the index operator.
     */
    public inline operator fun `get`(index: Int): Char = values[index]

    /**
     * See [CharArray.getOrNull]
     */
    public inline fun getOrNull(index: Int): Char? = values.getOrNull(index)

    public operator fun component1(): Char = get(0)

    public operator fun component2(): Char = get(1)

    public operator fun component3(): Char = get(2)

    public operator fun component4(): Char = get(3)

    public operator fun component5(): Char = get(4)

    /**
     * See [CharArray.single]
     */
    public inline fun single(): Char = values.single()

    /**
     * See [CharArray.single]
     */
    public inline fun single(predicate: (element: Char) -> Boolean): Char {
        return values.single(predicate)
    }

    /**
     * See [CharArray.singleOrNull]
     */
    public inline fun singleOrNull(): Char? = values.singleOrNull()

    /**
     * See [CharArray.singleOrNull]
     */
    public inline fun singleOrNull(predicate: (element: Char) -> Boolean): Char? {
        return values.singleOrNull(predicate)
    }

    /**
     * See [CharArray.first]
     */
    public inline fun first(): Char = values.first()

    /**
     * See [CharArray.first]
     */
    public inline fun first(predicate: (element: Char) -> Boolean): Char {
        return values.first(predicate)
    }

    /**
     * See [CharArray.firstOrNull]
     */
    public inline fun firstOrNull(): Char? = values.firstOrNull()

    /**
     * See [CharArray.firstOrNull]
     */
    public inline fun firstOrNull(predicate: (element: Char) -> Boolean): Char? {
        return values.firstOrNull(predicate)
    }

    /**
     * See [CharArray.last]
     */
    public inline fun last(): Char = values.last()

    /**
     * See [CharArray.last]
     */
    public inline fun last(predicate: (element: Char) -> Boolean): Char {
        return values.last(predicate)
    }

    /**
     * See [CharArray.lastOrNull]
     */
    public inline fun lastOrNull(): Char? = values.lastOrNull()

    /**
     * See [CharArray.lastOrNull]
     */
    public inline fun lastOrNull(predicate: (element: Char) -> Boolean): Char? {
        return values.lastOrNull(predicate)
    }

    /**
     * See [CharArray.iterator]
     */
    public inline operator fun iterator(): Iterator<Char> = values.iterator()

    /**
     * See [CharArray.asIterable]
     */
    public inline fun asIterable(): Iterable<Char> = values.asIterable()

    /**
     * See [CharArray.withIndex]
     */
    public inline fun withIndex(): Iterable<IndexedValue<Char>> = values.withIndex()

    /**
     * See [CharArray.asSequence]
     */
    public inline fun asSequence(): Sequence<Char> = values.asSequence()

    /**
     * See [CharArray.forEach]
     */
    public inline fun forEach(action: (element: Char) -> Unit) {
        values.forEach(action)
    }

    /**
     * See [CharArray.forEachIndexed]
     */
    public inline fun forEachIndexed(action: (index: Int, element: Char) -> Unit) {
        values.forEachIndexed(action)
    }

    /**
     * See [CharArray.all]
     */
    public inline fun all(predicate: (predicate: Char) -> Boolean): Boolean {
        return values.all(predicate)
    }

    /**
     * See [CharArray.any]
     */
    public inline fun any(predicate: (predicate: Char) -> Boolean): Boolean {
        return values.any(predicate)
    }

    /**
     * See [CharArray.none]
     */
    public inline fun none(predicate: (predicate: Char) -> Boolean): Boolean {
        return values.none(predicate)
    }

    /**
     * See [CharArray.count]
     */
    public inline fun count(predicate: (predicate: Char) -> Boolean): Int {
        return values.count(predicate)
    }

    /**
     * See [CharArray.indexOfFirst]
     */
    public inline fun indexOfFirst(predicate: (element: Char) -> Boolean): Int {
        return values.indexOfFirst(predicate)
    }

    /**
     * See [CharArray.indexOfLast]
     */
    public inline fun indexOfLast(predicate: (element: Char) -> Boolean): Int {
        return values.indexOfLast(predicate)
    }

    /**
     * Creates a pair of immutable arrays, where the first contains elements for which the predicate
     * yielded true, and the second contains the other elements.
     */
    public fun partition(predicate: (element: Char) -> Boolean): Pair<ImmutableCharArray, ImmutableCharArray> {
        val first = Builder()
        val second = Builder()
        for (element in values) {
            when (predicate(element)) {
                true -> first.add(element)
                else -> second.add(element)
            }
        }
        return Pair(first.build(), second.build())
    }

    /**
     * Leaves this immutable array as is and returns an ImmutableCharArray with all elements sorted
     * according to the natural sort order of the value returned by the [selector].
     *
     * The sort is _stable_ so equal elements preserve their order relative to each other after
     * sorting.
     */
    public inline fun <R : Comparable<R>> sortedBy(crossinline selector: (element: Char) -> R?): ImmutableCharArray {
        return sortedWith(compareBy(selector))
    }

    /**
     * Leaves this immutable array as is and returns an ImmutableCharArray with all elements sorted
     * according to the reverse natural sort order of the value returned by the [selector].
     *
     * The sort is _stable_ so equal elements preserve their order relative to each other after
     * sorting.
     */
    public inline fun <R : Comparable<R>> sortedByDescending(crossinline selector: (element: Char) -> R?): ImmutableCharArray {
        return sortedWith(compareByDescending(selector))
    }

    /**
     * Leaves this immutable array as is and returns an [ImmutableCharArray] with all elements
     * sorted according to the specified [comparator].
     */
    public fun sortedWith(comparator: Comparator<in Char>): ImmutableCharArray {
        // Immutable arrays can't be mutated, so it's safe to return the same array when the ordering won't change
        if (size <= 1) return this

        val temp = values.toTypedArray()
        Arrays.sort(temp, comparator)
        return temp.toImmutableArray()
    }

    public companion object {
        @PublishedApi
        internal val EMPTY: ImmutableCharArray = ImmutableCharArray(CharArray(0))

        /**
         * Returns an ImmutableCharArray instance of the specified [size], where each element is
         * calculated by calling the [init] function.
         *
         * [init] is called sequentially, starting at index 0, to initialize the array with each
         * element at its given index.
         *
         * Implementation:
         * We're using the invoke operator instead of a regular constructor so that we can declare
         * it inline.  The call site will look like a regular constructor call.
         */
        public inline operator fun invoke(size: Int, `init`: (index: Int) -> Char): ImmutableCharArray {
            if (size == 0) return EMPTY

            val backingArray = CharArray(size) { index -> init(index) }
            return ImmutableCharArray(backingArray)
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

        private var values: CharArray = CharArray(initialCapacity)

        public fun add(element: Char): Builder {
            ensureCapacity(size + 1)
            values[size++] = element
            return this
        }

        /**
         * Adds the [element] to the builder.
         */
        public operator fun plusAssign(element: Char) {
            add(element)
        }

        public fun addAll(elements: CharArray): Builder {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements, 0, values, size, elements.size)
            size += elements.size
            return this
        }

        public fun addAll(elements: Array<Char>): Builder {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
            return this
        }

        public fun addAll(elements: ImmutableCharArray): Builder {
            ensureCapacity(size + elements.size)
            System.arraycopy(elements.values, 0, values, size, elements.size)
            size += elements.size
            return this
        }

        public fun addAll(elements: ImmutableArray<Char>): Builder {
            ensureCapacity(size + elements.size)
            for (element in elements) {
                values[size++] = element
            }
            return this
        }

        public fun addAll(elements: Iterable<Char>): Builder {
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

        public fun addAll(elements: Sequence<Char>): Builder {
            elements.forEach { add(it) }
            return this
        }

        /**
         * Returns an immutable array containing the elements that were added.
         */
        public fun build(): ImmutableCharArray {
            when (size) {
                0 -> return EMPTY
                values.size -> return ImmutableCharArray(values)
            }
            val backingArray = CharArray(size)
            System.arraycopy(values, 0, backingArray, 0, size)
            return ImmutableCharArray(backingArray)
        }

        private fun ensureCapacity(minCapacity: Int) {
            val newCapacity = BuilderUtils.computeNewCapacity(values.size, minCapacity)
            if (newCapacity == values.size) return

            val replacement = CharArray(newCapacity)
            System.arraycopy(values, 0, replacement, 0, size)
            values = replacement
        }
    }
}
