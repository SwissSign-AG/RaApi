
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from swisssign_ra_api.v2.api.api_registration_api import ApiRegistrationApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from swisssign_ra_api.v2.api.api_registration_api import ApiRegistrationApi
