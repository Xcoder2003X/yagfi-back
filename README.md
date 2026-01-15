<!-- TOC -->
* [Introduction](#introduction)
  * [Why yet another good-first-issue project?](#why-yet-another-good-first-issue-project)
  * [Implementation](#implementation)
  * [Need fix](#need-fix)
  * [Frontend](#frontend)
* [What's next](#whats-next)
<!-- TOC -->

# Introduction
YAGFI - yet another good first issue
<div align="center">
  <a href="https://www.bestpractices.dev/en/projects/11787"><img src="https://www.bestpractices.dev/projects/10534/badge" alt="OpenSSF Best Practices"></a>
</div>

## Why yet another good-first-issue project?
First of all, when I searched for projects to contribute, I met one thing. 
Existing projects does not support all variety of labels:
- good-first-issue
- status: ideal-for-contribution
- beginner-friendly
- help wanted
and others.

The second reason was smart filtering. I'd like to contribute into live projects. 
Many of existing good-first-issue issues are abandoned.

To compare with, look for other similar projects:
- [goodfirstissue.dev](https://goodfirstissue.dev/)
- [goodfirstissues.com](https://goodfirstissues.com/)
- [goodfirstissue.com](http://goodfirstissue.com/)
- [goodfirstissue.org](https://www.goodfirstissue.org/)
- [forgoodfirstissue.github.com](https://forgoodfirstissue.github.com/)
- [up-for-grabs.net](https://up-for-grabs.net/)

## Implementation
- Data updates every 12 minutes since GitHub rate limit allows no more
- The list of current supported issues is [here](https://github.com/Regyl/yagfi-back/blob/master/src/main/resources/data/labels.txt)
  - See [CONTRIBUTING](https://github.com/Regyl/yagfi-back/tree/master/docs/CONTRUBUTING.md) if you found some unsupported labels

## Need fix
- Supply each new query as task to task executor to reuse threads
- Remove all issues with label *stale* by filtering the response since it contains labels
- Add support for GitLab issues

## Frontend
Frontend for this project is placed [here](https://github.com/Regyl/yagfi-front). Yes, it's vibe-coded. 
Just because firstly I am a backend developer. See [CONTRIBUTING](https://github.com/Regyl/yagfi-back/tree/master/docs/CONTRUBUTING.md)
if you would like to fix it.

# What's next
- Android app with notifications about new issues by favorite filter preset
- AI to looking for new labels that might be another custom form of good-first-issue
- Pass OpenSSF Best practices https://www.bestpractices.dev/en/projects/11787/passing
- Think about [RecGFI](https://github.com/mcxwx123/RecGFI) LLM