import request from "supertest";
import app from "./index";
import {before} from "mocha";
import {expect} from "chai";

describe("Get /",() => {

    let response: request.Response;

    before("execute request",async () => {
        response = await request(app).get("/");
    });

    it("should response with status code 200", () => {
        expect(response.status).to.be.equal(200);
    });

    it("should respond with text 'Hello World!'", () => {
        expect(response.text).to.contain("Hello");
    });
});