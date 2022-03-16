package ComparatorExample;

import java.util.*;
import java.util.function.Supplier;

public class Solusion {
    public static class Statistics {
        private final Supplier<Collection<GameStatistics>> statisticsSource;

        public Statistics(Supplier<Collection<GameStatistics>> statisticsSource) {
            this.statisticsSource = statisticsSource;
        }

        public static void main(String[] args) {
            Statistics statistics = new Statistics(new StatisticsSource());
            Collection<GameStatistics> gameStatistics = statistics.statisticsSource.get();
            // TODO: make it work

            List<GameStatistics> games = new ArrayList<>();
            games.addAll(gameStatistics);

            SoldMostComparator mostComparator = new SoldMostComparator();
            games.sort(mostComparator);
            String mostIncomeGames = games.get(0).name;

            SoldLessComparator lessComparator = new SoldLessComparator();
            games.sort(lessComparator);
            String leastIncomeGames = games.get(0).name;

            System.out.println("Most income game(s): " + mostIncomeGames);
            System.out.println("Least income game(s): " + leastIncomeGames);
//            System.out.println("Income by genre: " + incomeByGenre);
        }
    }

    public static class SoldMostComparator implements Comparator<GameStatistics> {
        @Override
        public int compare(GameStatistics o1, GameStatistics o2) {
            if (o1.sold == o2.sold) {
                return 0;
            }
            if (o1.sold < o2.sold) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }

    public static class SoldLessComparator implements Comparator<GameStatistics> {
        @Override
        public int compare(GameStatistics o1, GameStatistics o2) {
            if (o1.sold == o2.sold) {
                return 0;
            }
            if (o1.sold > o2.sold) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }


        static class StatisticsSource implements Supplier<Collection<GameStatistics>> {
            @Override
            public Collection<GameStatistics> get() {
                return Arrays.asList(
                        new GameStatistics("Witcher 3", Genre.RPG, 800, 1_000_000, 0),
                        new GameStatistics("God of war 4", Genre.RPG, 1200, 834_000, 3),
                        new GameStatistics("Last of us 2", Genre.ACTION, 4200, 434_000, 3567),
                        new GameStatistics("Dota 2", Genre.STRATEGY, 0, 10_000, 0),
                        new GameStatistics("Red Alert", Genre.STRATEGY, 120, 13400, 1)
                );
            }
        }


        static class GameStatistics {
            /**
             * Название игры
             */
            public final String name;
            /**
             * Жанр игры
             */
            public final Genre genre;
            /**
             * Цена за 1 копию
             */
            public final long price;
            /**
             * Копий продано
             */
            public final long sold;
            /**
             * Копий возвращено
             */
            public final long refunded;

            public GameStatistics(String name, Genre genre, long price, long sold, long refunded) {
                this.name = name;
                this.price = price;
                this.genre = genre;
                this.sold = sold;
                this.refunded = refunded;
            }

            public String getName() {
                return name;
            }

            public Genre getGenre() {
                return genre;
            }

            public long getPrice() {
                return price;
            }

            public long getSold() {
                return sold;
            }

            public long getRefunded() {
                return refunded;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                GameStatistics that = (GameStatistics) o;
                return price == that.price &&
                        sold == that.sold &&
                        refunded == that.refunded &&
                        Objects.equals(name, that.name) &&
                        genre == that.genre;
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, genre, price, sold, refunded);
            }
        }

        enum Genre {
            ACTION,
            RPG,
            STRATEGY,
        }
    }

