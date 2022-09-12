### Note ###
- This plugin is not maintained by *Fortify Software*, nee *Micro Focus* nor *Hewlett-Packard, Inc. (HP)*
- Plugin version 1.0 supports HP WebInspect 10.20 versions and later.

### Features ###
- Upload any supported scan file(s) from your Jenkins Slave/Master to your Fortify Software Security Center (SSC) web server using your WebInspect API deployment.
- Ability to specify any scan filename under the Project's workspace using Jenkin's environmental variables.
- (2022) [Fortify ScanCentral DAST](https://www.microfocus.com/en-us/cyberres/use-cases/enterprise-dast) may be a valid replacement for this webinspect-plugin, as it may be replacing WebInspect Enterprise and fully integrates into SSC.

### Installation & Setup ###
A [WebInspect Desktop](https://www.microfocus.com/en-us/cyberres/application-security/webinspect) installation or [WebInspect Enterprise](https://www.microfocus.com/documentation/fortify-webinspect-enterprise/) deployment with an *API Key* created from your [Fortify SSC Server installation](https://www.microfocus.com/en-us/cyberres/application-security/software-security-center).

### Jenkins Global Config ###
![Global Configuration for WebInspect Jenkins Plugin](https://github.com/automationdomination/webinspect-plugin/blob/develop_bms/images/WebInspectPluginGlobal.png)

### Jenkins Project Config ###
![Project Configuration for WebInspect Jenkins Plugin](https://github.com/automationdomination/webinspect-plugin/blob/develop_bms/images/WebInspectPluginProject.png)

### License ###
MIT License (MIT)

### Contact ###
otto _[at]_ automationdomination _[dot]_ me
