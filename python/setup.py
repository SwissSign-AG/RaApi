"""
    SwissSign RA REST API

    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Contact: opensource@swisssign.com
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301

NAME = "SwissSignRaApi"
VERSION = "2.0.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
  "urllib3 >= 1.25.3",
  "python-dateutil",
]

setup(
    name=NAME,
    version=VERSION,
    description="SwissSign RA REST API",
    author="SwissSign Support",
    author_email="opensource@swisssign.com",
    url="https://github.com/SwissSign-AG/RaApi",
    keywords=["OpenAPI", "OpenAPI-Generator", "SwissSign RA REST API"],
    python_requires=">=3.6",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description="""\
    See https://github.com/SwissSign-AG/RaApi/README.md  # noqa: E501
    """
)
