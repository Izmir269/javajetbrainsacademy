package Collectors;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class CollectorsExemple {
    public static void main(String[] args) {
        // Liste à partir d'un stream ou d'un Set
        Stream<Account> accountStream = new Stream<Account>() {
            @Override
            public Stream<Account> filter(Predicate<? super Account> predicate) {
                return null;
            }

            @Override
            public <R> Stream<R> map(Function<? super Account, ? extends R> function) {
                return null;
            }

            @Override
            public IntStream mapToInt(ToIntFunction<? super Account> toIntFunction) {
                return null;
            }

            @Override
            public LongStream mapToLong(ToLongFunction<? super Account> toLongFunction) {
                return null;
            }

            @Override
            public DoubleStream mapToDouble(ToDoubleFunction<? super Account> toDoubleFunction) {
                return null;
            }

            @Override
            public <R> Stream<R> flatMap(Function<? super Account, ? extends Stream<? extends R>> function) {
                return null;
            }

            @Override
            public IntStream flatMapToInt(Function<? super Account, ? extends IntStream> function) {
                return null;
            }

            @Override
            public LongStream flatMapToLong(Function<? super Account, ? extends LongStream> function) {
                return null;
            }

            @Override
            public DoubleStream flatMapToDouble(Function<? super Account, ? extends DoubleStream> function) {
                return null;
            }

            @Override
            public Stream<Account> distinct() {
                return null;
            }

            @Override
            public Stream<Account> sorted() {
                return null;
            }

            @Override
            public Stream<Account> sorted(Comparator<? super Account> comparator) {
                return null;
            }

            @Override
            public Stream<Account> peek(Consumer<? super Account> consumer) {
                return null;
            }

            @Override
            public Stream<Account> limit(long l) {
                return null;
            }

            @Override
            public Stream<Account> skip(long l) {
                return null;
            }

            @Override
            public void forEach(Consumer<? super Account> consumer) {

            }

            @Override
            public void forEachOrdered(Consumer<? super Account> consumer) {

            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <A> A[] toArray(IntFunction<A[]> intFunction) {
                return null;
            }

            @Override
            public Account reduce(Account account, BinaryOperator<Account> binaryOperator) {
                return null;
            }

            @Override
            public Optional<Account> reduce(BinaryOperator<Account> binaryOperator) {
                return Optional.empty();
            }

            @Override
            public <U> U reduce(U u, BiFunction<U, ? super Account, U> biFunction, BinaryOperator<U> binaryOperator) {
                return null;
            }

            @Override
            public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super Account> biConsumer, BiConsumer<R, R> biConsumer1) {
                return null;
            }

            @Override
            public <R, A> R collect(Collector<? super Account, A, R> collector) {
                return null;
            }

            @Override
            public Optional<Account> min(Comparator<? super Account> comparator) {
                return Optional.empty();
            }

            @Override
            public Optional<Account> max(Comparator<? super Account> comparator) {
                return Optional.empty();
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public boolean anyMatch(Predicate<? super Account> predicate) {
                return false;
            }

            @Override
            public boolean allMatch(Predicate<? super Account> predicate) {
                return false;
            }

            @Override
            public boolean noneMatch(Predicate<? super Account> predicate) {
                return false;
            }

            @Override
            public Optional<Account> findFirst() {
                return Optional.empty();
            }

            @Override
            public Optional<Account> findAny() {
                return Optional.empty();
            }

            @Override
            public Iterator<Account> iterator() {
                return null;
            }

            @Override
            public Spliterator<Account> spliterator() {
                return null;
            }

            @Override
            public boolean isParallel() {
                return false;
            }

            @Override
            public Stream<Account> sequential() {
                return null;
            }

            @Override
            public Stream<Account> parallel() {
                return null;
            }

            @Override
            public Stream<Account> unordered() {
                return null;
            }

            @Override
            public Stream<Account> onClose(Runnable runnable) {
                return null;
            }

            @Override
            public void close() {

            }
        };
         List<Account> accounts = accountStream.collect(Collectors.toList());
         Set<Account> accounts2 = accountStream.collect(Collectors.toSet());

        // Quand la collection n'est pas un Set ou une List => dans l'exemple c'est une liste chaînée LinkedList
         LinkedList<Account> accounts3 = accountStream.collect(Collectors.toCollection(LinkedList::new));

         // Méthode qui renvoie une seule valeur => somme des balances
        long summary = accounts.stream().collect(Collectors.summingLong(Account::getBalance));

        double average = accounts.stream()
                .collect(Collectors.averagingDouble(Account::getBalance)); // renvoie un double

        // Collectors.reducing
        // ici account -> account.getNumber() est le mapper
        String megaNumber = accountStream.collect(Collectors.reducing("",
                account -> account.getNumber(),
                (numbers, number) -> numbers.concat(number)
        ));
    }
}
