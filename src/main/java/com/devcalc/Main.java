package com.devcalc;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();
        Javalin app = Javalin.create().start(8080);

        app.get("/add", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(calculator.add(a, b)));
        });

        app.get("/subtract", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(calculator.subtract(a, b)));
        });

        app.get("/multiply", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(calculator.multiply(a, b)));
        });

        app.get("/divide", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(calculator.divide(a, b)));
        });

        app.get("/health", ctx -> ctx.result("OK"));
    }
}