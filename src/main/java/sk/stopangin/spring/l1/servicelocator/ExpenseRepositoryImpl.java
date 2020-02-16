package sk.stopangin.spring.l1.servicelocator;

import sk.stopangin.spring.l1.Expense;
import sk.stopangin.spring.l1.ExpenseRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExpenseRepositoryImpl implements ExpenseRepository {

    public ExpenseRepositoryImpl() {
    }

    @Override
    public List<Expense> getAllExpenses() {
        Random random = new Random(1324);

        return Arrays.asList(
                new Expense(random.nextInt(1000)),
                new Expense(random.nextInt(1000)),
                new Expense(random.nextInt(1000))
        );
    }
}
