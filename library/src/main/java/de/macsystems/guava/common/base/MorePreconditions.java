package de.macsystems.guava.common.base;

import com.google.common.base.Preconditions;

import java.util.Collection;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.ThreadSafe;

/**
 * Extension of guava {@link Preconditions} class.
 */
@Immutable
@ThreadSafe
public final class MorePreconditions
{
    /**
     * @param expression
     */
    public static void checkArgument(final boolean expression)
    {
        Preconditions.checkArgument(expression);
    }


    /**
     * @param expression
     * @param errorMessage
     */
    public static void checkArgument(final boolean expression, final String errorMessage)
    {
        Preconditions.checkArgument(expression, errorMessage);
    }


    /**
     * @param expression
     * @param errorMessageTemplate
     * @param errorMessageArgs
     */
    public static void checkArgument(final boolean expression, final String errorMessageTemplate,
                                     final Object... errorMessageArgs)
    {
        Preconditions.checkArgument(expression, errorMessageTemplate, errorMessageArgs);
    }


    /**
     * @param expression
     */
    public static void checkState(final boolean expression)
    {
        Preconditions.checkState(expression);
    }


    /**
     * @param expression
     * @param errorMessage
     */
    public static void checkState(final boolean expression, final Object errorMessage)
    {
        Preconditions.checkState(expression, errorMessage);
    }


    /**
     * @param expression
     * @param errorMessageTemplate
     * @param errorMessageArgs
     */
    public static void checkState(final boolean expression, final String errorMessageTemplate,
                                  final Object... errorMessageArgs)
    {
        Preconditions.checkState(expression, errorMessageTemplate, errorMessageArgs);
    }


    /**
     * @param reference
     * @return
     */
    public static <T> T checkNotNull(final T reference)
    {
        return Preconditions.checkNotNull(reference);
    }


    /**
     * @param reference
     * @param errorMessage
     * @return
     */
    public static <T> T checkNotNull(final T reference, final String errorMessage)
    {
        return Preconditions.checkNotNull(reference, errorMessage);
    }


    /**
     * @param reference
     * @param errorMessageTemplate
     * @param errorMessageArgs
     * @return
     */
    public static <T> T checkNotNull(final T reference, final String errorMessageTemplate,
                                     final Object... errorMessageArgs)
    {
        return Preconditions.checkNotNull(reference, errorMessageTemplate, errorMessageArgs);
    }


    /**
     * @param index
     * @param size
     * @return
     */
    public static int checkElementIndex(final int index, final int size)
    {
        return Preconditions.checkElementIndex(index, size);
    }


    /**
     * @param index
     * @param size
     * @param desc
     * @return
     */
    public static int checkElementIndex(final int index, final int size, final String desc)
    {
        return Preconditions.checkElementIndex(index, size, desc);
    }


    /**
     * @param index
     * @param size
     * @return
     */
    public static int checkPositionIndex(final int index, final int size)
    {
        return Preconditions.checkPositionIndex(index, size);
    }


    /**
     * @param index
     * @param size
     * @param desc
     * @return
     */
    public static int checkPositionIndex(final int index, final int size, final String desc)
    {
        return Preconditions.checkPositionIndex(index, size, desc);
    }


    /**
     * @param start
     * @param end
     * @param size
     */
    public static void checkPositionIndexes(final int start, final int end, final int size)
    {
        Preconditions.checkPositionIndexes(start, end, size);
    }


    /**
     * Start of Addons
     */

    /**
     * Checks that {@link Collection} contains T.
     *
     * @param set   not null
     * @param value not null
     */
    public static <T> void checkContains(@Nonnull final Collection<T> set, @Nonnull final T value)
    {
        Preconditions.checkNotNull(set, "Collection");
        Preconditions.checkNotNull(value, "value");

        if (!set.contains(value))
        {
            throw new IllegalStateException("Collection does not contain :" + String.valueOf(value));
        }
    }


    /**
     * Ensures that a {@link Map} contains K
     *
     * @param map
     * @param key
     */
    public static <K, V> void checkContainsKey(@Nonnull final Map<K, V> map, @Nonnull final K key)
    {
        Preconditions.checkNotNull(map, "Map");
        Preconditions.checkNotNull(key, "key");

        if (!map.containsKey(key))
        {
            throw new IllegalStateException("Map does not contain key:" + String.valueOf(key));
        }
    }


    /**
     * Ensures that a {@link Map} not contains K
     *
     * @param map
     * @param key
     */
    public static <K, V> void checkNotContainsKey(@Nonnull final Map<K, V> map, @Nonnull final K key)
    {
        Preconditions.checkNotNull(map, "Map");
        Preconditions.checkNotNull(key, "key");

        if (map.containsKey(key))
        {
            throw new IllegalStateException("Map does contain key:" + String.valueOf(key));
        }
    }


    /**
     * Ensures that a {@link Map} contains V
     *
     * @param map
     * @param value
     */
    public static <K, V> void checkContainsValue(@Nonnull final Map<K, V> map, @Nonnull final V value)
    {
        Preconditions.checkNotNull(map, "Map");
        Preconditions.checkNotNull(value, "value");

        if (!map.containsValue(value))
        {
            throw new IllegalStateException("Map does not contain value:" + String.valueOf(value));
        }
    }


    /**
     * Ensures that a {@link Map} does not contain V
     *
     * @param map
     * @param value
     */
    public static <K, V> void checkNotContainsValue(@Nonnull final Map<K, V> map, @Nonnull final V value)
    {
        Preconditions.checkNotNull(map, "Map");
        Preconditions.checkNotNull(value, "value");

        if (map.containsValue(value))
        {
            throw new IllegalStateException("Map does contain value:" + String.valueOf(value));
        }
    }


    /**
     * Checks if {@link Collection} is empty.
     *
     * @param collection
     */
    public static <T> void checkNotEmpty(@Nonnull final Collection<T> collection)
    {
        Preconditions.checkNotNull(collection, "collection");

        if (collection.isEmpty())
        {
            throw new IllegalStateException("Collection is empty");
        }
    }


    /**
     * Checks if {@link Collection} is empty.
     *
     * @param collection
     * @param message
     */
    public static <T> void checkNotEmpty(@Nonnull final Collection<T> collection, final String message)
    {
        Preconditions.checkNotNull(collection, "collection");

        if (collection.isEmpty())
        {
            throw new IllegalStateException(String.valueOf(message));
        }
    }


    /**
     * Checks if {@link String} is empty and contains no whitespace (trim).
     *
     * @param value
     */
    public static <T> void checkNotEmpty(@Nonnull final String value, @Nonnull final String message)
    {
        Preconditions.checkNotNull(value, "String");
        if ("".equals(value))
        {
            throw new IllegalArgumentException("String is empty");
        }
        if (value.trim().length() == 0)
        {
            throw new IllegalArgumentException("Trimmed String is empty!");
        }
    }


    /**
     * Checks that String starts with given string.<br>
     * Method is case sensitive!
     *
     * @param <T>
     * @param startOfString
     * @param toCheck       eg http://
     */
    public static <T> void checkStringStartsWith(@Nonnull final String startOfString, @Nonnull final String toCheck)
    {
        Preconditions.checkNotNull(startOfString, "start of string");
        MorePreconditions.checkNotEmpty(startOfString, "start of string");
        Preconditions.checkNotNull(toCheck, "string to check");
        MorePreconditions.checkNotEmpty(toCheck, "string to check");

        if (toCheck.startsWith(startOfString))
        {
            return;
        }
        throw new IllegalArgumentException("Expected that '" + toCheck + "' starts with '" + startOfString + "'");

    }


    /**
     * Checks that either one or two is <code>null</code>. if both references are valid or null it is also handled as an
     * failure.
     *
     * @param one
     * @param two
     * @param nameOne
     * @param nameTwo
     */
    public static <T> void eitherOrIsNull(final T one, final T two, final String nameOne, final String nameTwo)
    {
        if (one == null && two == null)
        {
            throw new IllegalArgumentException(
                    "Reference One and Two are null, but expected that just one have to be null of :\n" + nameOne
                            + "\n" + nameTwo);
        }

        if (one != null && two != null)
        {
            throw new IllegalArgumentException(
                    "Reference One and Two are Valid, but expected that just one have to be valid of :\n" + nameOne
                            + "\n" + nameTwo);
        }
    }

    private MorePreconditions()
    {
    }
}