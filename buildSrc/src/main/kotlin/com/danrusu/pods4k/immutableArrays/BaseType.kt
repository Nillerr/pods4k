package com.danrusu.pods4k.immutableArrays

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.WildcardTypeName
import com.squareup.kotlinpoet.asTypeName
import kotlin.reflect.KClass

private val genericType = TypeVariableName("T")

internal enum class BaseType(
    val type: TypeName,
    val typeClass: KClass<*>,
    val backingArrayType: TypeName,
    val backingArrayConstructor: String,
    val generatedClassName: String,
) {
    GENERIC(
        type = genericType,
        typeClass = Any::class,
        backingArrayType = Array::class.asTypeName().parameterizedBy(WildcardTypeName.producerOf(genericType)),
        backingArrayConstructor = "Array<Any?>",
        generatedClassName = "ImmutableArray",
    ),
    BOOLEAN(Boolean::class, BooleanArray::class),
    BYTE(Byte::class, ByteArray::class),
    CHAR(Char::class, CharArray::class),
    SHORT(Short::class, ShortArray::class),
    INT(Int::class, IntArray::class),
    LONG(Long::class, LongArray::class),
    FLOAT(Float::class, FloatArray::class),
    DOUBLE(Double::class, DoubleArray::class),
    ;

    constructor(
        type: KClass<*>,
        arrayType: KClass<*>,
    ) : this(
        type = type.asTypeName(),
        typeClass = type,
        backingArrayType = arrayType.asTypeName(),
        backingArrayConstructor = arrayType.simpleName!!,
        generatedClassName = "Immutable${type.simpleName}Array",
    )

    fun getGeneratedClass(): ClassName = ClassName(ImmutableArrayConfig.packageName, generatedClassName)

    fun getGeneratedTypeName(): TypeName = when (this) {
        GENERIC -> getGeneratedClass().parameterizedBy(type)
        else -> getGeneratedClass()
    }
}
