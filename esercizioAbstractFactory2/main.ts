import { AbstractFactory, createFactory } from "./factory/abstractFactory";

const main = (factoryType: string) => {
    const abstractFactory: AbstractFactory = createFactory(factoryType);
    console.log(abstractFactory.createButton().click());
}

main("Pc");