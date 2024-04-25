// Auto-generated file. DO NOT EDIT!
package com.danrusu.pods4k.immutableArrays

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.PublishedApi
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.IndexedValue
import kotlin.collections.Iterable
import kotlin.collections.Iterator
import kotlin.collections.List
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
 * underlying methods directly.
 */
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
    @Suppress("NOTHING_TO_INLINE")
    public inline fun isEmpty(): Boolean = values.isEmpty()

    /**
     * See [LongArray.isNotEmpty]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun isNotEmpty(): Boolean = values.isNotEmpty()

    /**
     * Returns the element at the specified [index]. This method can be called using the index
     * operator.
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun `get`(index: Int): Long = values[index]

    /**
     * See [LongArray.getOrNull]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun getOrNull(index: Int): Long? = values.getOrNull(index)

    public operator fun component1(): Long = get(0)

    public operator fun component2(): Long = get(1)

    public operator fun component3(): Long = get(2)

    public operator fun component4(): Long = get(3)

    public operator fun component5(): Long = get(4)

    /**
     * See [LongArray.single]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun single(): Long = values.single()

    /**
     * See [LongArray.single]
     */
    public inline fun single(predicate: (element: Long) -> Boolean): Long = values.single(predicate)

    /**
     * See [LongArray.singleOrNull]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun singleOrNull(): Long? = values.singleOrNull()

    /**
     * See [LongArray.singleOrNull]
     */
    public inline fun singleOrNull(predicate: (element: Long) -> Boolean): Long? =
            values.singleOrNull(predicate)

    /**
     * See [LongArray.first]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun first(): Long = values.first()

    /**
     * See [LongArray.first]
     */
    public inline fun first(predicate: (element: Long) -> Boolean): Long = values.first(predicate)

    /**
     * See [LongArray.firstOrNull]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun firstOrNull(): Long? = values.firstOrNull()

    /**
     * See [LongArray.firstOrNull]
     */
    public inline fun firstOrNull(predicate: (element: Long) -> Boolean): Long? =
            values.firstOrNull(predicate)

    /**
     * See [LongArray.last]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun last(): Long = values.last()

    /**
     * See [LongArray.last]
     */
    public inline fun last(predicate: (element: Long) -> Boolean): Long = values.last(predicate)

    /**
     * See [LongArray.lastOrNull]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun lastOrNull(): Long? = values.lastOrNull()

    /**
     * See [LongArray.lastOrNull]
     */
    public inline fun lastOrNull(predicate: (element: Long) -> Boolean): Long? =
            values.lastOrNull(predicate)

    /**
     * See [LongArray.toList]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun toList(): List<Long> = values.toList()

    /**
     * See [LongArray.iterator]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun iterator(): Iterator<Long> = values.iterator()

    /**
     * See [LongArray.asIterable]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun asIterable(): Iterable<Long> = values.asIterable()

    /**
     * See [LongArray.withIndex]
     */
    @Suppress("NOTHING_TO_INLINE")
    public inline fun withIndex(): Iterable<IndexedValue<Long>> = values.withIndex()

    /**
     * See [LongArray.asSequence]
     */
    @Suppress("NOTHING_TO_INLINE")
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
}
