import {multiply} from "./calculator";
import * as assert from "assert";

describe("multiply()", () => {
    it("should return 4 when 2 is multiplied by 2", () => {
        const result: number = multiply(2, 2);
        assert.equal(result, 4);
    });

    const tests = [
        {args: {a: 2, b: 3}, expected: 6},
        {args: {a: 4, b: 4}, expected: 16},
        {args: {a: 10, b: 3}, expected: 30}
    ];

    tests.forEach(({args, expected}) => {
        it(`should return ${expected} when ${args.a} is multiplied by ${args.b}`, () => {
            const result: number = multiply(args.a, args.b);
            assert.equal(result, expected);
        });
    });
});
