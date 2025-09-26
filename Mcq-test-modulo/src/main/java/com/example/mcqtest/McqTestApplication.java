package com.example.mcqtest;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.mcqtest.model.Question;
import com.example.mcqtest.repository.QuestionRepository;

@SpringBootApplication
public class McqTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(McqTestApplication.class, args);
    }

    @Bean
    CommandLineRunner seedQuestions(QuestionRepository repo) {
        return args -> {
            repo.deleteAll(); // optional: clears old questions

            repo.save(new Question("Which of the following is an immutable data type in Python?",
                    List.of("Set", "Tuple", "List", "Dictionary"), 1));

            repo.save(new Question("How do you create an empty set in Python?",
                    List.of("{}", "[]", "set()", "empty()"), 2));

            repo.save(new Question("Which method adds an element to a set?",
                    List.of("append()", "add()", "insert()", "extend()"), 1));

            repo.save(new Question("What is the output of 'hello'.upper()?",
                    List.of("Hello", "HELLO", "hello", "Error"), 1));

            repo.save(new Question("Which of the following is a valid tuple?",
                    List.of("{1, 2, 3}", "(1, 2, 3)", "[1, 2, 3]", "tuple[1, 2, 3]"), 1));

            repo.save(new Question("Which method removes all items from a dictionary?",
                    List.of("delete()", "clear()", "pop()", "remove()"), 1));

            repo.save(new Question("What is the result of len([1, 2, 3])?",
                    List.of("Error", "2", "1", "3"), 3));

            repo.save(new Question("Which operator is used to concatenate strings?",
                    List.of("+", "&", "%", "*"), 0));

            repo.save(new Question("What does list(set([1, 2, 2, 3])) return?",
                    List.of("[2, 3]", "[1, 2, 3]", "[1, 3]", "[1, 2, 2, 3]"), 1));

            repo.save(new Question("Which method returns the number of times a value appears in a list?",
                    List.of("index()", "search()", "count()", "find()"), 2));

            repo.save(new Question("Which of the following is a mutable data type?",
                    List.of("Tuple", "String", "List", "int"), 2));

            repo.save(new Question("What is the output of 'abc'[::-1]?",
                    List.of("abc", "cba", "bca", "Error"), 1));

            repo.save(new Question("Which method removes a specific item from a set?",
                    List.of("discard()", "remove()", "pop()", "delete()"), 1));

            repo.save(new Question("Which method returns the index of a substring in a string?",
                    List.of("find()", "index()", "search()", "locate()"), 1));

            repo.save(new Question("Which of the following creates a dictionary?",
                    List.of("dict()", "{}", "set()", "[]"), 1));

            repo.save(new Question("What is the output of len({'a':1, 'b':2})?",
                    List.of("1", "2", "3", "0"), 1));

            repo.save(new Question("Which method is used to get all keys from a dictionary?",
                    List.of("keys()", "getKeys()", "allKeys()", "fetchKeys()"), 0));

            repo.save(new Question("Which method splits a string into a list?",
                    List.of("split()", "divide()", "explode()", "separate()"), 0));

            repo.save(new Question("Which method joins list elements into a string?",
                    List.of("join()", "append()", "merge()", "combine()"), 0));
//
//            repo.save(new Question("What is the output of type((1,))?",
//                    List.of("<class 'tuple'>", "<class 'int'>", "<class 'list'>", "<class 'set'>"), 0));
//
//            repo.save(new Question("Which method removes and returns an arbitrary set element?",
//                    List.of("pop()", "remove()", "discard()", "clear()"), 0));
//
//            repo.save(new Question("Which method returns the value for a given key in a dictionary?",
//                    List.of("get()", "find()", "lookup()", "search()"), 0));
//
//            repo.save(new Question("Which method reverses a list?",
//                    List.of("reverse()", "invert()", "flip()", "back()"), 0));
//
//            repo.save(new Question("What is the output of 'Python'.startswith('Py')?",
//                    List.of("True", "False", "None", "Error"), 0));
//
//            repo.save(new Question("Which method returns a copy of a dictionary?",
//                    List.of("copy()", "clone()", "duplicate()", "replicate()"), 0));
//
//            repo.save(new Question("What is the output of 'abc'.find('b')?",
//                    List.of("0", "1", "2", "-1"), 1));
//
//            repo.save(new Question("Which method removes the last item from a list?",
//                    List.of("pop()", "remove()", "discard()", "delete()"), 0));
//
//            repo.save(new Question("Which method checks if a key exists in a dictionary?",
//                    List.of("has_key()", "in", "exists()", "contains()"), 1));
//
//            repo.save(new Question("Which method returns all values in a dictionary?",
//                    List.of("values()", "getValues()", "all()", "items()"), 0));
//
//            repo.save(new Question("What is the output of 'abc'.replace('a','x')?",
//                    List.of("xbc", "axbc", "abc", "xbcabc"), 0));
//
//            repo.save(new Question("Which method returns a sorted list from a set?",
//                    List.of("sort()", "sorted()", "order()", "arrange()"), 1));
//
//            repo.save(new Question("Which method adds multiple elements to a list?",
//                    List.of("extend()", "append()", "add()", "insert()"), 0));
//
//            repo.save(new Question("Which method returns the number of items in a dictionary?",
//                    List.of("size()", "length()", "len()", "count()"), 2));
//
//            repo.save(new Question("What is the output of 'abc'.isalpha()?",
//                    List.of("True", "False", "None", "Error"), 0));
//
//            repo.save(new Question("Which method converts a list to a tuple?",
//                    List.of("tuple()", "list()", "convert()", "cast()"), 0));
//
//            repo.save(new Question("Which method removes all elements from a set?",
//                    List.of("clear()", "removeAll()", "delete()", "empty()"), 0));
//
//            repo.save(new Question("Which method returns both keys and values from a dictionary?",
//                    List.of("items()", "pairs()", "entries()", "getAll()"), 0));
//
//            repo.save(new Question("Which method checks if a string ends with a specific substring?",
//                    List.of("ends()", "endswith()", "finish()", "close()"), 1));
//
//            repo.save(new Question("Which method returns the smallest item in a list?",
//                    List.of("min()", "smallest()", "least()", "first()"), 0));
//
//            repo.save(new Question("Which method returns the largest item in a list?",
//                    List.of("max()", "largest()", "greatest()", "last()"), 0));
//
//            repo.save(new Question("Which method converts a string to lowercase?",
//                    List.of("lower()", "down()", "small()", "minify()"), 0));
//
//            repo.save(new Question("Which method checks if all characters in a string are digits?",
//                    List.of("isdigit()", "isnumber()", "isnumeric()", "isint()"), 0));
//
//            repo.save(new Question("Which method returns a list of characters from a string?",
//                    List.of("list()", "split()", "chars()", "explode()"), 0));
//
//            repo.save(new Question("Which method removes a key from a dictionary?",
//                    List.of("pop()", "remove()", "discard()", "delete()"), 0));
//
//            repo.save(new Question("Which method checks if a set is a subset of another?",
//                    List.of("subset()", "issubset()", "ispart()", "contains()"), 1));
//
//            repo.save(new Question("Which method checks if a set is a superset of another?",
//                    List.of("superset()", "issuperset()", "iswhole()", "includes()"), 1));
//
//            repo.save(new Question("Which method returns the difference between two sets?",
//                    List.of("difference()", "subtract()", "exclude()", "minus()"), 0));
//
//            repo.save(new Question("Which method returns the intersection of two sets?",
//                    List.of("intersect()", "intersection()", "common()", "match()"), 1));
//
//            repo.save(new Question("Which method returns the union of two sets?",
//                    List.of("union()", "combine()", "merge()", "addAll()"), 0));
//            
//            repo.save(new Question("Which of the following is a valid way to create a tuple?",
//            		List.of("(1, 2)", "[1, 2]", "{1, 2}", "tuple[1, 2]"), 0));
//            repo.save(new Question("What is the output of len(('a', 'b', 'c'))?", List.of("2", "3", "1", "0"), 1));
//            repo.save(new Question("Which method adds an element to a set?", List.of("add()", "append()", "insert()", "extend()"), 0));
//            repo.save(new Question("Which method removes a specific element from a set?", List.of("remove()", "discard()", "pop()", "clear()"), 0));
//            repo.save(new Question("What is the output of 'Python'[0]?", List.of("'P'", "'y'", "'n'", "'o'"), 0));
//            repo.save(new Question("Which method returns the number of times a value appears in a list?", List.of("count()", "index()", "find()", "search()"), 0));
//            repo.save(new Question("Which method returns the index of a value in a list?", List.of("index()", "find()", "position()", "locate()"), 0));
//            repo.save(new Question("Which method splits a string into a list?", List.of("split()", "divide()", "explode()", "separate()"), 0));
//            repo.save(new Question("Which method joins list elements into a string?", List.of("join()", "append()", "merge()", "combine()"), 0));
//            repo.save(new Question("Which method returns all keys from a dictionary?", List.of("keys()", "getKeys()", "allKeys()", "fetchKeys()"), 0));
//            repo.save(new Question("Which method returns all values from a dictionary?", List.of("values()", "getValues()", "all()", "items()"), 0));
//            repo.save(new Question("Which method returns key-value pairs from a dictionary?", List.of("items()", "pairs()", "entries()", "getAll()"), 0));
//            repo.save(new Question("Which method removes all items from a dictionary?", List.of("clear()", "removeAll()", "delete()", "empty()"), 0));
//            repo.save(new Question("Which method removes a key from a dictionary?", List.of("pop()", "remove()", "discard()", "delete()"), 0));
//            repo.save(new Question("Which method returns the value for a given key?", List.of("get()", "find()", "lookup()", "search()"), 0));
//            repo.save(new Question("Which method checks if a key exists in a dictionary?", List.of("in", "has_key()", "exists()", "contains()"), 0));
//            repo.save(new Question("Which method returns a copy of a dictionary?", List.of("copy()", "clone()", "duplicate()", "replicate()"), 0));
//            repo.save(new Question("Which method reverses a list?", List.of("reverse()", "invert()", "flip()", "back()"), 0));
//            repo.save(new Question("Which method sorts a list?", List.of("sort()", "order()", "arrange()", "sequence()"), 0));
//            repo.save(new Question("Which method returns a sorted version of a list?", List.of("sorted()", "sort()", "order()", "sequence()"), 0));
//            repo.save(new Question("Which method adds multiple elements to a list?", List.of("extend()", "append()", "add()", "insert()"), 0));
//            repo.save(new Question("Which method adds a single element to a list?", List.of("append()", "extend()", "insert()", "add()"), 0));
//            repo.save(new Question("Which method inserts an element at a specific index?", List.of("insert()", "append()", "extend()", "add()"), 0));
//            repo.save(new Question("Which method removes the last item from a list?", List.of("pop()", "remove()", "discard()", "delete()"), 0));
//            repo.save(new Question("Which method removes a specific item from a list?", List.of("remove()", "pop()", "discard()", "delete()"), 0));
//            repo.save(new Question("Which method checks if all characters in a string are digits?", List.of("isdigit()", "isnumber()", "isnumeric()", "isint()"), 0));
//            repo.save(new Question("Which method checks if all characters in a string are alphabetic?", List.of("isalpha()", "isletter()", "istext()", "isword()"), 0));
//            repo.save(new Question("Which method converts a string to lowercase?", List.of("lower()", "down()", "small()", "minify()"), 0));
//            repo.save(new Question("Which method converts a string to uppercase?", List.of("upper()", "up()", "big()", "maximize()"), 0));
//            repo.save(new Question("Which method checks if a string starts with a specific substring?", List.of("startswith()", "starts()", "begin()", "prefix()"), 0));
//            repo.save(new Question("Which method checks if a string ends with a specific substring?", List.of("endswith()", "ends()", "finish()", "suffix()"), 0));
//            repo.save(new Question("Which method replaces a substring in a string?", List.of("replace()", "substitute()", "change()", "swap()"), 0));
//            repo.save(new Question("Which method finds the index of a substring?", List.of("find()", "index()", "locate()", "search()"), 0));
//            repo.save(new Question("What is the output of 'abc'.find('b')?", List.of("1", "0", "2", "-1"), 0));
//            repo.save(new Question("What is the output of 'abc'.replace('a','x')?", List.of("xbc", "abc", "axbc", "xbcabc"), 0));
//            repo.save(new Question("What is the output of 'abc'.upper()?", List.of("ABC", "abc", "Abc", "aBc"), 0));
//            repo.save(new Question("What is the output of 'abc'.lower()?", List.of("abc", "ABC", "Abc", "aBc"), 0));
//            repo.save(new Question("What is the output of 'abc'.count('a')?", List.of("1", "0", "2", "3"), 0));
//            repo.save(new Question("What is the output of 'abc'.startswith('a')?", List.of("True", "False", "None", "Error"), 0));
//            repo.save(new Question("What is the output of 'abc'.endswith('c')?", List.of("True", "False", "None", "Error"), 0));
//            repo.save(new Question("What is the output of 'abc'.isalpha()?", List.of("True", "False", "None", "Error"), 0));
//            repo.save(new Question("What is the output of '123'.isdigit()?", List.of("True", "False", "None", "Error"), 0));
//            repo.save(new Question("What is the output of 'abc123'.isalnum()?", List.of("True", "False", "None", "Error"), 0));
//            repo.save(new Question("Which method returns the union of two sets?", List.of("union()", "combine()", "merge()", "addAll()"), 0));
//            repo.save(new Question("Which method returns the intersection of two sets?", List.of("intersection()", "intersect()", "common()", "match()"), 0));
//            repo.save(new Question("Which method returns the difference between two sets?", List.of("difference()", "subtract()", "exclude()", "minus()"), 0));
//            repo.save(new Question("Which method checks if a set is a subset of another?", List.of("issubset()", "subset()", "ispart()", "contains()"), 0));
//            repo.save(new Question("Which method checks if a set is a superset of another?", List.of("issuperset()", "superset()", "iswhole()", "includes()"), 0));
//         // Q101
//            repo.save(new Question("Which method returns the number of occurrences of a value in a tuple?", List.of("count()", "index()", "find()", "search()"), 0));
//
//            // Q102
//            repo.save(new Question("Which method returns the index of the first occurrence of a value in a tuple?", List.of("index()", "find()", "position()", "locate()"), 0));
//
//            // Q103
//            repo.save(new Question("Which keyword is used to define a set in Python?", List.of("set()", "{}", "[]", "()"), 0));


        };
    }

}
