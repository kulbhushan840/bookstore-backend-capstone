# Agentic Development Notes

This file records a transparent development workflow for the learning activity.

## Workflow

1. Convert the bookstore requirement into small implementation tasks.
2. Ask the coding agent for an initial implementation proposal.
3. Review the proposed design and code rather than accepting it unchanged.
4. Refine validation, exception handling, API boundaries, and tests.
5. Run the application and API tests.
6. Fix failures and repeat the review/test cycle.
7. Commit the resulting implementation with meaningful commit messages.

## Example prompt used during development

> Build a small Spring Boot REST API for an eCommerce bookstore. Start with a books resource and an orders resource. Keep the design simple and maintainable. Include validation, clear HTTP status codes, exception handling and tests. Explain the changes before applying them.

## Human review checkpoints

- API paths and HTTP methods
- Request validation
- Error responses
- Persistence model
- Test coverage
- Security of configuration/secrets
- Readability and maintainability

The agent is treated as a development accelerator, not as an authority. Final changes should be reviewed and tested by the developer.
