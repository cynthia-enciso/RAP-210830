# Common Functional Interfaces
They are defined in the java.util.function package and are often used with streams and other Java classes.

## Supplier<T>
* 0 parameters
* get()
* returns T

## Consumer<T>
* 1 parameter
* accept(T)
* returns void

## BiConsumer<T, U>
* 2 parameters
* accept(T, U)
* returns void

## Predicate<T>
* 1 parameter
* test(T)
* returns boolean

## BiPredicate<T, U>
* 2 parameters
* test(T, U)
* returns boolean

## Function<T, R>
* 1 parameter
* apply(T)
* returns R

## BiFunction<T, U, R>
* 2 parameters
* apply(T, U)
* returns R